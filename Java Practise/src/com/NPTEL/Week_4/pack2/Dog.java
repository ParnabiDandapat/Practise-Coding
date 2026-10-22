package com.NPTEL.Week_4.pack2;

import com.NPTEL.Week_4.pack1.Animal;

public class Dog extends Animal {

    void display() {
        sound();        // Allowed
        super.sound();  // Allowed

        Animal a = new Animal();
        // a.sound();   // Compile-time error if uncommented
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();

        //Animal a =new Dog();
        // a.display(); // Compile-time error
        // a.sound();   // Compile-time error
    }
}
