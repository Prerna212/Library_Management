package com.github.prerna.books.dao;

import com.github.prerna.books.Books;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

public interface Dao {
   void setDataSource(DataSource ds);
   List<Books> getBooks() throws SQLException;
   void insertBooks(int id, String title, String category) throws SQLException;
   void deleteBooksById(int id) throws SQLException;
   void updateBooksById(String title, String category , int id) throws SQLException;
   List<Books> findUsersWithBooks();
}