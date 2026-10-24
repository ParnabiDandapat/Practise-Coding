package com.NPTEL.Week_2;
//Example of Information hiding
//You can write a new static method in the
// subclass with the same signature
// as the one in the superclass, thus hiding it.

class A_2 {
    static void show() {
        System.out.println("A");
    }
}

class B_2 extends A_2 {
    static void show() {
        System.out.println("B");
    }
}

public class MyStatic {
    public static void main(String args[]) {
        A_2 obj = new B_2();
        obj.show();
    }
}
