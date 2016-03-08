package com.springapp.mvc.dao;

import com.springapp.mvc.User;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDAO {

    private JdbcTemplate jdbcTemplate;

    public UserDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public User getUserById(int id){
        return jdbcTemplate.queryForObject(
                "select * from user where id = ?",
                new UserRowMapper(),
                id
        );
    }

    public void addUser(User user){
        String sql = "insert into user values (?, ?)";
        jdbcTemplate.update(sql, user.getId(), user.getName());
    }

    public int totalPersonsCount(){
        String sql = "select count(*) from user";
        return jdbcTemplate.queryForInt(sql);
    }

}