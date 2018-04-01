package com.in28minutes.database.databasedemo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.in28minutes.database.databasedemo.entity.Person;

class PersonRowMapper implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Person person = new Person();
		person.setId(resultSet.getInt("id"));
		person.setName(resultSet.getString("name"));
		person.setLocation(resultSet.getString("location"));
		person.setBirthDate(resultSet.getTimestamp("birth_date"));
		return person;
	}
}
