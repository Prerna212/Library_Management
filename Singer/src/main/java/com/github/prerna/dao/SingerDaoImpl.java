package com.github.prerna.dao;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;

import javax.sql.DataSource;

public class SingerDaoImpl implements SingerDao, InitializingBean {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void afterPropertiesSet() throws Exception{
        if(dataSource == null ){
            throw new BeanCreationException("must set datasource on SingerDao");
        }
    }
    @Override
    public String findNamebyId(Long id) {
        return null;
    }
}
