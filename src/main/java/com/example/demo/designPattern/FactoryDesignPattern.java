package com.example.demo.designPattern;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        FactoryDesignPattern pattern = new FactoryDesignPattern();
        Design design = pattern.getObject("sketch");
        design.print();

        design = pattern.getObject("free");
        design.print();

    }

    public Design getObject(String flag) {
        if(flag.equals("free"))
            return new FreeDesign();
        else
            return new SketchDesign();
    }
}

interface Design {
    void print();
}

class FreeDesign implements Design{
    @Override
    public void print() {
        System.out.println("FreeDesign!!");
    }
}

class SketchDesign implements Design{
    @Override
    public void print() {
        System.out.println("SketchDesign!!");
    }
}
