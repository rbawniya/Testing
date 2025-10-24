package com.example.interview;

import java.util.HashMap;
import java.util.Objects;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DemoClass {
    public static void main(String[] args) {
        HashMap<Employee, String> map = new HashMap<>();
        Employee employee = new Employee("Rajnee");
        Employee employee1 = new Employee("Rajnee");
        System.out.println(employee.equals(employee));
        map.put(employee, "12");
        map.put(employee1, "4");
        System.out.println(map.size());
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
