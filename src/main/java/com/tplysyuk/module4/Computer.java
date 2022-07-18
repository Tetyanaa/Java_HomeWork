package com.tplysyuk.module4;

public class Computer {
    String brand;
    int screen_size;
    int num_colors;
    String type;

    public Computer(String brand, int screen_size) {
        this.brand = brand;
        this.screen_size = screen_size;
    }

    public String toString() {
        return "Computer is " + brand + screen_size;
    }

    public static void main(String[] args) {
        Computer workComputer = new Computer("hp", 24);
        Computer homeComputer = new Computer("Dell", 29);

        System.out.println(workComputer);
        System.out.println(homeComputer);
    }
}
