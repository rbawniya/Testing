package com.example.demo;

import java.util.*;

public class ComparableInterface {
    public static void main(String[] args) {
        HashSet<Employee> hashSet = new HashSet<>();
        hashSet.add(new Employee(1,"ab"));
        hashSet.add(new Employee(2,"qw"));
        hashSet.add(new Employee(4,"aba"));
        hashSet.add(new Employee(3,"abv"));
        TreeSet<Employee> employees = new TreeSet<>(hashSet);
        employees.stream().forEach(System.out :: println);

        HashMap<Employee, Integer> map = new HashMap<>();
        map.put(new Employee(1,"ab"), 1);
        map.put(new Employee(2,"er"), 2);
        map.put(new Employee(6,"vb"), 3);
        map.put(new Employee(3,"sd"), 4);

        TreeMap<Employee, Integer> treeMap = new TreeMap<>(map);

        treeMap.entrySet().stream().forEach(System.out :: println);

    }
}

class Employee implements Comparable<Employee> {
    private int id;
    private String name;

    @Override
    public int compareTo(Employee employee) {
        if(this.id == employee.getId())
            return 0;
        else if(this.id > employee.getId())
            return 1;
        else
            return  -1;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
