package Oop.Tests;

import Oop.exercise.ClassRoom;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {
    public static void main(String[] args) {
        ClassRoom Student1 = new ClassRoom("Sam Parks", "parks@gmail.com", 'm', 12, 4);
        System.out.println(Student1);  // toString()

        // Test Setters and Getters
        Student1.setEmail("teck@somewhere.com");
        System.out.println(Student1);  // toString()

        System.out.println("name is: " + Student1.getFullname());
        System.out.println("gender is: " + Student1.getGender());
        System.out.println("email is: " + Student1.getEmail());
        System.out.println("grade is: "+ Student1.getGrade());

    }
}
