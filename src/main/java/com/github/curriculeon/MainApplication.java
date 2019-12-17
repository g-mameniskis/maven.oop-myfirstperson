package com.github.curriculeon;

public class MainApplication {
    public static void main(String[] args) {
        Runnable myObject = new MyObject();
        myObject.run();
        Person human = new Person();

        human.setFirstName("Felix");
        human.setLastName("Leone");

        System.out.println("My first name is " + human.getFirstName());
        System.out.println("and my last name is " + human.getLastName());

        Person human1 = new Person("hmhjghj", "fdhf");
    }
}
