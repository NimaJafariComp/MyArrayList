package edu.csun.comp182;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        String [] words = new String[] {
                "attraction", "valley", "bury", "anger", "slant", "vegetation", "explosion", "circumstance",
                "reproduce", "eliminate", "workshop", "motif", "freight", "fireplace", "temperature",
                "brick", "classroom", "ample", "perfume", "commerce", "castle", "deck", "cable", "maid",
                "hang", "perfect", "weed", "investigation", "captain", "hunter", "auction", "inflation",
                "profession" };

        MyArrayList<Book> mylist = new MyArrayList<>();
        for (String str: words) {
            Book title = new Book(str);
            mylist.add(title);
            System.out.println("List size: " + mylist.size());
        }

        Book war = new Book("war");
        Book name = new Book("peace");

        List<Book> realist = new ArrayList<>();
        Collections.sort(realist, new Book.CompareByAuthorClass());

    }
}