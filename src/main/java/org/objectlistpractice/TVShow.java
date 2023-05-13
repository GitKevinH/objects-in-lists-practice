package org.objectlistpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class TVShow {

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
