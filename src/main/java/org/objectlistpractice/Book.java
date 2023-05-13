package org.objectlistpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {




    //class definitions
    String title;
    int pages;
    int published;

    public Book(String title, int pages, int published) {
        this.title = title;
        this.pages = pages;
        this.published = published;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getPublication() {
        return this.published;
    }

    @Override
    public String toString() {
        return this.title +", "+this.pages+" pages, "+this.published;
    }
}
