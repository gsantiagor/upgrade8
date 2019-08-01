/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author GSantiagoR
 */
class Student {
    String name;
    int age;
}

public class pregunta02 {
    public static void main(String[] args) {
        Student bob = new Student();
        Student jan = new Student();
        bob.name = "Bob";
        bob.age = 19;
        jan = bob;
        System.out.println("Bob´s name:" + jan.name);
        //Bob´s name:Bob
    }
}
