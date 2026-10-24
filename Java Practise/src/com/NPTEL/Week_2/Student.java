package com.NPTEL.Week_2;

class Student {
    static int marks;

    static {
        marks = 90;
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println(marks);
    }
}