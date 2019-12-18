package com.github.curriculeon;

public class MainApplication {
    public static void main(String[] args) {
        Runnable myObject = new MyObject();
        myObject.run();
        // creating an instance of the Person class (human).
        // Translation: human variable of type Person(left) instantiates the Person(right) class.
        // Person human is a variable declaration
        // new operator instantiates the Person class
        // ref: http://journals.ecs.soton.ac.uk/java/tutorial/java/javaOO/objectcreation.html
        Person human = new Person();
        // this sets the value for my setters in Person.java
        human.setFirstName("Felix");
        human.setLastName("Leone");

        System.out.println("Behold! The beauty of Encapsulation.");
        System.out.println("--------------------------------------");
        // this calls my getter which is designed to return the value of my local variables of class Person
        System.out.println("My first name is --> " + human.getFirstName());
        System.out.println("and my last name is --> " + human.getLastName());

        // if I decided to use the constructor (not actually a constructor) in Person.java, this is how
        // i would create an instance
        Person human1 = new Person("hmhjghj", "fdhf");
    }
}
