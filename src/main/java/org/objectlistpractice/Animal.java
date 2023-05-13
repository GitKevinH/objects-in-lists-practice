package org.objectlistpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Animal {

    //defining the class
    String name;
    boolean isDog;

    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public String getName() {
        return this.name;
    }

    public boolean isDog() {
        return this.isDog;
    }

    @Override
    public String toString() {
        return this.name + " is a dog = " + this.isDog;
    }
}
