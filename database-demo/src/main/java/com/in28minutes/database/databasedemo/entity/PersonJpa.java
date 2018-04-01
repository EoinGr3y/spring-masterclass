package com.in28minutes.database.databasedemo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "person")
@NamedQuery(name = "find_all_persons", query = "select p from PersonJpa p")
public class PersonJpa {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String location;
    private Date birthDate;

    public PersonJpa() {
    }

    public PersonJpa(final int id, final String name, final String location, final Date birthDate) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    public PersonJpa(final String name, final String location, final Date birthDate) {
        super();
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(final String location) {
        this.location = location;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(final Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "\nPerson [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate + "]";
    }

}
