package org.objectlistpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Animal Class
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
            System.out.println("--------------------"); //to make it easier to see between classes

        //TV Show Class

                ArrayList<TVShow> tvShowList = new ArrayList<>();
                System.out.println("Entering nothing will stop the prompts.");

                while (true) {
                    System.out.println("Name of the show: ");
                    String showName = scanner.nextLine();

                    if (showName.equals("")) {
                        break;
                    }

                    System.out.println("How many episodes?");
                    int showEpisodes  = Integer.parseInt(scanner.nextLine());

                    System.out.println("What is the genre?");
                    String showGenre = scanner.nextLine();


                    tvShowList.add(new TVShow(showName,showEpisodes,showGenre)
                    );
                }

                for (TVShow shows: tvShowList) {
                    System.out.println(shows);
                }
                System.out.println("--------------------"); //to make it easier to see between classes

        //Book Class

                ArrayList<Book> bookList = new ArrayList<>();

                //adding 3 instances of book
                bookList.add(new Book("The Intelligent Investor", 623,1949));
                bookList.add(new Book("How to Win Friends and Influence People", 288,1936));
                bookList.add(new Book("Rich Dad, Poor Dad",195,1997));

                //prompting user
                System.out.println("Entering nothing as the book title will stop the prompts.");

                while(true){

                    System.out.println("What is the book's title?");
                    String bookTitle = scanner.nextLine();

                    if (bookTitle.equals("")) {
                        break;
                    }

                    System.out.println("How many pages does the book have?");
                    int bookPages = Integer.parseInt(scanner.nextLine());

                    System.out.println("When was the book published?");
                    int bookPublished = Integer.parseInt(scanner.nextLine());

                    bookList.add(new Book(bookTitle,bookPages,bookPublished));
                }

                System.out.println("What do you want to have printed? Enter 'everything' for all of the book information or 'name' for just the book titles.");
                String input = scanner.nextLine();

                if(input.equalsIgnoreCase("everything")){
                    System.out.println();
                    for (Book book :bookList){
                        System.out.println(book);
                    }
                }else if (input.equalsIgnoreCase("name")){
                    System.out.println();
                    for (Book book :bookList){
                        System.out.println(book.title);
                    }

                }

    }
}
