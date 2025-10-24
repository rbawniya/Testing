package com.example.demo;

import java.util.Date;


/*
  Class Final
  Date member final and private
  No setter method
  Deep cloning of mutable object
  full parameterized the constructor
*/
public final class ImmutableClass {
    private final int id;
    private final String name;
    private final Date date;

    ImmutableClass(int id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = new Date(date.getTime());
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Date getDate() {
        return new Date(this.date.getTime());
    }
}


