package com.example.project;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(5, 10);
        Point p2 = new Point(-6, 17);
        Point p3 = new Point(18, 4);
        System.out.println(p1.distanceTo(p2));
    }
}