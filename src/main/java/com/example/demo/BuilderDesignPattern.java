package com.example.demo;

public class BuilderDesignPattern {
    public static void main(String[] args) {
        Laptop laptop = new Laptop().build().id(12).cpu("core5");
        System.out.println(laptop);
    }
}

class Laptop {
    private int id;
    private String modelName;
    private String cpu;
    private String memory;

    @Override
    public String toString() {
        return this.id+" "+this.memory+"-"+this.cpu+"-"+this.memory;
    }
    public Laptop id(int id) {
        this.id = id;
        return this;
    }

    public Laptop modelName(String name) {
        this.modelName = name;
        return this;
    }

    public Laptop cpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public Laptop memory(String memory) {
        this.memory = memory;
        return this;
    }

    public Laptop build() {
        return this;
    }

}
