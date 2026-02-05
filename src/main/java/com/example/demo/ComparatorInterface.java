package com.example.demo;

import java.util.Comparator;
import java.util.TreeMap;

public class ComparatorInterface {
    public static void main(String[] args) {
        TreeMap<Department, Integer> map = new TreeMap<>(new DepartmentSortByName());
        map.put(new Department(2,"ra",3l), 1);
        map.put(new Department(2,"dah",3l), 1);
        map.put(new Department(2,"ara",3l), 1);
        map.entrySet().stream().forEach(System.out :: println);
    }
}


class Department {
    private int id;
    private String name;
    private long count;

    public Department(int id, String name, long count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}

class DepartmentSortById implements Comparator<Department> {

    @Override
    public int compare(Department d1, Department d2) {
        if(d1.getId() == d2.getId())
            return 0;
        else  if(d1.getId() > d2.getId())
            return -1;
        else
            return 1;
    }
}

class DepartmentSortByName implements Comparator<Department> {
    @Override
    public int compare(Department d1, Department d2) {
        return d1.getName().compareTo(d2.getName());
    }
}