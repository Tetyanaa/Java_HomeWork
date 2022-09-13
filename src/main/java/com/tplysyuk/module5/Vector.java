package com.tplysyuk.module5;

import java.util.Random;

public class Vector {
    double x;
    double y;
    double z;

    public Vector(double x1, double y1, double z1) {
        x = x1;
        y = y1;
        z = z1;
    }

    public double vectorLength() {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    public double scalarMultiplication(Vector v) {

        return (this.x * v.x + y * v.y + z * v.z);
    }

    public static Vector[] randomVector(int n) {
        Vector[] randomVector = new Vector[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            Vector vector = new Vector(random.nextInt(), random.nextInt(), random.nextInt());
            randomVector[i] = vector;
        }
        return randomVector;
    }

}

