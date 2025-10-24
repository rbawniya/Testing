package com.example.demo;


public enum EnumClass {
    PIN(1, "pin","pin card transactions"),
    PINLESS(2, "poin-less","Poinless Transaction");

    private int code;
    private String action;
    private String description;


    EnumClass(int i, String pin, String s) {
        this.code = i;
        this.action = pin;
        this.description = s;
    }
}

