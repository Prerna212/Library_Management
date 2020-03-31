package com.github.prerna.books.config;

import com.github.prerna.books.dao.Dao;
import com.github.prerna.books.dao.DaoImpl;
import org.postgresql.ds.PGSimpleDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
public class EmbeddedJdbcConfig {
    private static Logger logger = LoggerFactory.getLogger(EmbeddedJdbcConfig.class);

    @Bean
    public DataSource dataSource(){
       PGSimpleDataSource dataSource= new PGSimpleDataSource();
       dataSource.setDatabaseName("postgres");
       dataSource.setUser("postgres");
       dataSource.setPassword("password");
       dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
       return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }
    @Bean
    public Dao dao(){
        DaoImpl daoImp = new DaoImpl();
        daoImp.setJdbcTemplate(jdbcTemplate());
        return daoImp;
    }
}
