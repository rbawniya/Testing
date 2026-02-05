package com.example.demo.designPattern;

public class BuilderDesignPattern {
    public static void main(String[] args) {
        BuilderClass builderClass = new BuilderClass().build().id(12).qty(100).
                address("pune").name("abc");

        System.out.println(builderClass);
    }
}

class BuilderClass {
    private int id;
    private String name;
    private String address;
    private long qty;

    public BuilderClass id(int id) {
        this.id = id;
        return this;
    }

    public BuilderClass name(String name) {
        this.name = name;
        return this;
    }

    public BuilderClass address(String address) {
        this.address = address;
        return this;
    }

    public BuilderClass qty(long qty) {
        this.qty = qty;
        return this;
    }

    public BuilderClass build() {
        return this;
    }

    @Override
    public String toString() {
        return this.id+"-"+this.name+"-"+this.address+"-"+this.qty;
    }
}
