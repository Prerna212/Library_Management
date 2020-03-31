package com.github.prerna.books.dao;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.github.prerna.books.Books;
import org.springframework.jdbc.core.RowMapper;

public class BooksMapper  implements  RowMapper<Books>{

    @Override
    public Books mapRow(ResultSet rs, int rowNum) throws SQLException {
        Books books = new Books();
        books.setId(rs.getInt("id"));
        books.setTitle(rs.getString("title"));
        books.setCategory(rs.getString("category"));

        return books;
    }
}
