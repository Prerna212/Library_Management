package com.github.prerna.config;

import com.github.prerna.dao.SingerDao;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
public class EmbeddedJdbcConfig {
private static Logger logger = LoggerFactory.getLogger(EmbeddedJdbcConfig.class);

@Bean
public DataSource dataSource(){
    try{
        EmbeddedDatabaseBuilder dbBuilder =     new EmbeddedDatabaseBuilder();
        return dbBuilder.setType(EmbeddedDatabaseType.H2).addScripts("classpath:db/h2/schema.sql", "classpath:db/h2/test-data.sql").build();
    }catch (Exception e){
        logger.error("Embedded  DataSource bean  cannot be  created!" , e);
                return null;
    }
}

@Bean
public SingerDao singerDao(){
    SingerDao dao = new SingerDao() {
        @Override
        public String findNamebyId(Long id) {
            return null;
        }
    };
   // dao.setDataSource(dataSource());
    return dao;
}
}
