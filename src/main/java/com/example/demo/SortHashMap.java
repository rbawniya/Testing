package com.example.demo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "rajnee");
        map.put(2, "abc");
        map.put(4, "xyz");
        map.put(3, "pqr");

//        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry :: getValue)).collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue,(k,v)-> k, LinkedHashMap :: new));
//        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry :: getValue)).forEachOrdered(obj -> System.out.println(obj.getKey() +" "+obj.getValue()));
        sortByName();
    }

    public static void sortByName() {
        HashMap<Integer, Student> map = new HashMap<>();
        map.put(1, new Student(14, "abc"));
        map.put(2, new Student(13, "dsf"));
        map.put(3, new Student(12, "sf"));
        map.put(4, new Student(11, "asd"));
        map.put(5, new Student(10, "zys"));

        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach(obj -> System.out.println(obj.getKey()+" "+obj.getValue().getId()+" "+obj.getValue().getName()));

//        map.entrySet().forEach(obj -> System.out.println(obj.getKey()+" "+obj.getValue().getName()+" "+obj.getValue().getId()));
    }
}



class Student implements Comparable<Student> {
    private int id;
    private String name;

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.getName());
    }

    public Student(int id, String name) {
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
}
