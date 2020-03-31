package com.github.prerna.books.dao;

import com.github.prerna.books.Books;
import com.github.prerna.tutorial.annotation.Student;
import com.github.prerna.users.Users;
import org.postgresql.util.PSQLException;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.awt.print.Book;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DaoImpl implements Dao, InitializingBean {
    int id;
    String title, category;
    Connection connection;
    Statement statement;

     private DataSource dataSource;
     private JdbcTemplate jdbcTemplate;


    /*
   public void connect() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "password";
        connection = DriverManager.getConnection(url, user, password);
        statement = connection.createStatement();
    }
*/
  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
      this.jdbcTemplate = jdbcTemplate;
  }

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
  //    JdbcTemplate jdbcTemplate = new JdbcTemplate();
//       jdbcTemplate.setDataSource(dataSource);
    }

    @Override
    public List<Books> findUsersWithBooks() {
        String sql="select b.id, b.title, b.category" +" , u.name from books b"+" Inner join users u on b.id = u.id";
        return jdbcTemplate.query(sql, new BooksWithUsersEctractor());
    }

    @Override
    public List<Books> getBooks() throws SQLException {
    String sql = "select * from books";
    return jdbcTemplate.query(sql, (rs, rowNum) ->{
        Books book = new Books();
        book.setId(rs.getInt("id"));
        book.setTitle(rs.getString("title"));
        book.setCategory(rs.getString("category"));

        return book;
    });
    }

    @Override
    public void insertBooks(int id, String title, String category) throws SQLException {
     String sql = "insert into books Values(?,?,?)";
     jdbcTemplate.update(sql, id, title, category );
        System.out.println("inserted record");
    }

    @Override
    public void deleteBooksById(int id) throws SQLException {
    String sql = "delete from books where id = ?";
    jdbcTemplate.update(sql, id);
        System.out.println("Deleted Object");
    }

    @Override
    public void updateBooksById( String title, String category, int id) throws SQLException {
    String sql = "update books set title = ? , category = ? where id=? ";
    jdbcTemplate.update(sql,  title, category , id);
        System.out.println("Updated record for : "+id);
    }


    @Override
    public void afterPropertiesSet() throws Exception {

    }

   /*
    @Override
    public void getBooks() throws SQLException {

        connect();
        ResultSet resultSet = statement.executeQuery("select * from books");
        while (resultSet.next()) {
            System.out.print(resultSet.getInt("id") + "  " + resultSet.getString("title") + "  " + resultSet.getString("category"));
            System.out.println();
        }
        connection.close();
    }

    @Override
    public void insertBooks(Books book) throws SQLException {
        connect();
        String tempQuery = "insert into books Values('id','title','category')";

        try {
            statement.executeUpdate("insert into books (id,title,category) values ('" + book.getId() + "','" + book.getTitle() + "','" + book.getCategory() + "')");
        } catch (PSQLException ps) {
            System.out.println(ps);
        }

        connection.close();
    }

    @Override
    public void deleteBooksById(int id) throws SQLException {
        connect();
        try {
            statement.executeUpdate("delete from books where id='" + id + "' ");
        } catch (PSQLException ps) {
            System.out.println(ps);
        }
        connection.close();
    }

    @Override
    public void updateBooksById(int id, String name, String category) throws SQLException {

        connect();
        try {
            statement.executeUpdate("update books set title='" + name + "',category='" + category + "' where id='" + id + "' ");
        } catch (SQLException ps) {
            System.out.println(ps);
        }
    }

    */


    private static final class BooksWithUsersEctractor implements ResultSetExtractor<List<Books>>{

        @Override
        public List<Books> extractData(ResultSet rs) throws SQLException, DataAccessException {
            Map<Integer, Books> map = new HashMap<>();
            Books books;
            while(rs.next()){
                int id = rs.getInt("id");
                books = map.get(id);
                if(books == null ){
                    books = new Books();
                    books.setId(id);
                    books.setTitle(rs.getString("title"));
                    books.setCategory(rs.getString("category"));
                }
                int user_id = rs.getInt("id");
                if(id > 0){
                    Users users = new Users();
                    users.setId(id);
                    users.setName(rs.getString("name"));
                }
            }
            return new ArrayList<>(map.values());
        }
    }


}