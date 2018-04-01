package com.in28minutes.database.databasedemo.jdbc;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.PersonJdbc;

@Repository
public class PersonJdbcDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<PersonJdbc> findAll() {
        return jdbcTemplate.query("select * from Person", new PersonRowMapper());
    }

    public PersonJdbc findById(int id) {
        return jdbcTemplate.queryForObject("select * from Person where id=?", new Object[] { id },
                new BeanPropertyRowMapper<PersonJdbc>(PersonJdbc.class));
    }

    public List<PersonJdbc> findByLocation(String location) {
        return jdbcTemplate.query("select * from Person where location=?", new Object[] { location },
                new BeanPropertyRowMapper<PersonJdbc>(PersonJdbc.class));
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("delete from Person where id=?", new Object[] { id });
    }

    public int insert(PersonJdbc person) {
        return jdbcTemplate.update("insert into person(id, name, location, birth_date) values(?, ?, ?, ?);",
                new Object[] { person.getId(), person.getName(), person.getLocation(),
                        new Timestamp(person.getBirthDate().getTime()) });
    }

    public int update(PersonJdbc person) {
        return jdbcTemplate.update("update person set name = ?, location = ?, birth_date = ? " + "where id = ?",
                new Object[] { person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()),
                        person.getId() });
    }

}
