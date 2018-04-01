package com.in28minutes.database.databasedemo.entity;

import java.util.Date;

public class PersonJdbc {

    private int id;
    private String name;
    private String location;
    private Date birthDate;

    public PersonJdbc() {
    }

    public PersonJdbc(final int id, final String name, final String location, final Date birthDate) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    public int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(final String location) {
        this.location = location;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(final Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "\nPerson [id=" + this.id + ", name=" + this.name + ", location=" + this.location + ", birthDate="
                + this.birthDate + "]";
    }

}
