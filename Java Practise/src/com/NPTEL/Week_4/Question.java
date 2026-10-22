package com.NPTEL.Week_4;

class Person {
    int a = 1;
    int b = 1;
    public Person() {
        System.out.print(a * b + "Java" + a);
    }
}
class Employee extends Person {
    int a = 0;
    int b = 1;
    public Employee() {
        System.out.print(a + b + "Java" + a);
    }
}
public class Question {
    public static void main(String args[]) {
      //  Person p = new Employee(); and new Employee(); both will print same output
        new Employee();
    }
}