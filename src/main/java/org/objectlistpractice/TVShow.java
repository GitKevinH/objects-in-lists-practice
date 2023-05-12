package org.objectlistpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class TVShow {

    //To initialize the class object and run the requirements
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
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

    }


    // Class definition
    String showName;
    int numOfEpisodes;
    String genre;

    public TVShow(String showName, int numOfEpisodes, String genre) {
        this.showName = showName;
        this.numOfEpisodes = numOfEpisodes;
        this.genre = genre;
    }

    public String getShowName() {
        return this.showName;
    }

    public int getNumOfEpisodes() {
        return this.numOfEpisodes;
    }

    public String getGenre() {
        return this.genre;
    }

    @Override
    public String toString() {
        return "The name of the show is "+ this.showName +
                " with " + this.numOfEpisodes +
                " episodes. The genre is " + this.genre +".";
    }


}
