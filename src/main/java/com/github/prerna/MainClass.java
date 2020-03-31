package com.github.prerna;


import com.github.prerna.books.Books;
import com.github.prerna.books.config.EmbeddedJdbcConfig;
import com.github.prerna.books.dao.Dao;
import com.github.prerna.books.dao.DaoImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) throws SQLException {
      //  ApplicationContext context = new ClassPathXmlApplicationContext("spring/DataSource.xml");
        //Dao dao = context.getBean(/*"DaoImpl",*/ Dao.class);

        GenericApplicationContext context = new AnnotationConfigApplicationContext(EmbeddedJdbcConfig.class);
        Dao dao = context.getBean(Dao.class);

     /*   System.out.println("----------Insert Book Records----------");
        dao.insertBooks(1, "The Reader", "Romance");
        dao.insertBooks(2, "JAVA", "Technical Language");
        dao.insertBooks(3, "General English", "Competitive exam");

        System.out.println("----------Listing Multiple Records----------");
        List<Books> books = dao.getBooks();
        System.out.println(books.toString());

        System.out.println("----------Updating a Record----------");
        dao.updateBooksById( "Java: bitch", "Language", 2);

        System.out.println("----------Deleting a Record----------");
        dao.deleteBooksById(2);
        System.out.println("----------Listing Multiple Records----------");

     List<Books> books1 = dao.findUsersWithBooks();
        System.out.println(books1.toString());
        List<Books> books2 = dao.getBooks();

//*/

    }
}