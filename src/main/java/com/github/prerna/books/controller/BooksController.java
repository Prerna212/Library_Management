package com.github.prerna.books.controller;

import com.github.prerna.books.Books;
import com.github.prerna.books.service.BooksService;
import com.github.prerna.springPractice.MessageProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/books")
@RestController
public class BooksController {
private final Logger logger = LoggerFactory.getLogger(BooksController.class);

@Autowired
private BooksService booksService;
private MessageSource messageSource;

@GetMapping
public List<Books> getBooks(){
    return booksService.getAllBooks();
}
}
