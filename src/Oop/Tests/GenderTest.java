package Oop.Tests;

import Oop.exercise.Boys;
import Oop.exercise.ClassRoom;
import Oop.exercise.Girls;

public class GenderTest {
    public static void main(String[] args) {
        ClassRoom student1 = new ClassRoom("Sam Parks", "Parks@gmail.com", 'f',10, 3);
        System.out.println(student1);  // Author's toString()

        // Test Book's constructor and toString()
        Girls girl = new Girls("Susan Adams", "f", 10, 123 );
        System.out.println(girl);  // Book's toString()

        // Test Setters and Getters
        girl.setAge(8);
        girl.setHeight(120);
        System.out.println("name is: " + girl.getFullname());
        System.out.println("height is: " + girl.getHeight());
        System.out.println("age is: " + girl.getAge());


        // Test Book's constructor and toString()
        Boys boy = new Boys("Frank Adams", "m", 10, 125 );
        System.out.println(boy);  // Book's toString()

        // Test Setters and Getters
        boy.setAge(8);
        boy.setHeight(120);
        System.out.println("name is: " + boy.getFullname());
        System.out.println("height is: " + boy.getHeight());
        System.out.println("age is: " + boy.getAge());



    }
}

