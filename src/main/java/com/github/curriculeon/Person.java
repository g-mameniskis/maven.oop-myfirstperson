package com.github.curriculeon;

/**
 * Created by leon on 12/16/2019.
 */
public class Person {
    // these are my fields/local variables. it's very bad practice to give them values at this stage.
    // it's a good idea to make these private so that they can't be accessed outside of this class
    private String firstName;
    private String lastName;
    // this is my constructor. this associates my fields (state) with the parameters being passed.
    public Person(String firstName, String lastName) {
       this.firstName = firstName;
       this.lastName = lastName;
    }
    // this is another way to do line 12-14. This is encapsulation and is comparatively better practice.
    public Person(){}
    // Now let's get into Encapsulation:
    // this is my first getter. it returns the value of my variable, in this case firstName
    public String getFirstName() {
        return this.firstName;
    }
    // this is my setter. it takes a parameter (firstName) and assigns it to the firstName local variable
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
