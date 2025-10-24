package com.example.demo;

import java.io.*;

public class SerializationClass {
    public static void main(String[] args) {
        try(FileOutputStream outputStream = new FileOutputStream("txtfile.txt"); ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            Car car = new Car(1, "Exter");
            objectOutputStream.writeObject(car);
        } catch (Exception exception) {

        }
        try (FileInputStream fileInputStream = new FileInputStream("txtfile.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Car car = (Car) objectInputStream.readObject();
            System.out.println(car);
        } catch (IOException exception) {

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

class Car {
    private int id;
    private String name;
//    private String modelName;

    public Car(int id, String name) {
        this.id = id;
        this.name = name;
//        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", modelName='" +
                '}';
    }
}
