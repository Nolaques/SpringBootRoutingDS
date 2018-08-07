package com.company.springbootroutingds.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Repository
@Transactional
public class DataDAO extends JdbcDaoSupport{

    @Autowired
    public DataDAO(DataSource dataSource){
        this.setDataSource(dataSource);
    }

    public List<String> queryPublishers(){
        String sql = "Select name from Publishers";

        List<String> list = this.getJdbcTemplate().queryForList(sql, String.class);
        return list;
    }

    public List<String> queryAdvertisers(){
        String sql = "Select name from Advertisers";

        List<String> list = this.getJdbcTemplate().queryForList(sql, String.class);
        return list;
    }


}
