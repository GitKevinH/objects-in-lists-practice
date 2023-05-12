package org.objectlistpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Animal {

    //To initialize the class object and run the requirements
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Animal> animalList = new ArrayList<>();
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop.");

        while (true) {
            System.out.print("Please enter a name: ");
            String animalName = scanner.nextLine();

            if (animalName.equals("")) {
                break;
            }

            System.out.print("Is it a dog? Enter yes or no: ");
            String isDogOrNotStr = scanner.nextLine();
            boolean isDogOrNotBool;

            if(isDogOrNotStr.equalsIgnoreCase("yes")){
                 isDogOrNotBool = true;
            }
            else {
                 isDogOrNotBool = false;
            }



            animalList.add(new Animal(animalName, isDogOrNotBool));
        }

        //System.out.println(animalList);

        for (Animal animal: animalList) {
            System.out.println(animal);
        }

    }


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
