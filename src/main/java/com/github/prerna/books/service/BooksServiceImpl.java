package com.github.prerna.books.service;

import com.github.prerna.books.Books;
import com.github.prerna.books.dao.Dao;
import com.github.prerna.books.dao.DaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public class BooksServiceImpl implements BooksService {

    @Autowired
    private Dao daoImpl;
    @Override
    public List<Books> getAllBooks() {
        List<Books> books = null;
        try {
            books =  daoImpl.getBooks();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }
}
