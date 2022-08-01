package com.tplysyuk.module4;

public class Computer {
    private String brand;
    private int screenSize;
    private int numberColors;
    private String type;

    public Computer(String brand, int screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public String toString() {
        return "Computer is " + brand + screenSize;
    }
}
