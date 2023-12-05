package edu.csun.comp182;

import java.util.Comparator;

public class Book implements Comparable<Book> {

    public static class CompareByAuthorClass implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            return o1.author.compareTo(o2.author);
        }
    }

    public static class CompareByEditionClass implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            return o1.author.compareTo(o2.author);
        }
    }
    public static class CompareTillReversed implements Comparator<Book> {

        public int compare(Book o1, Book o2) {
            return -o1.title.compareTo(o2.title);
        }
    }


    private final String title;

    private final String author = null;

    private final int edition = 1;


    public Book(String title_arg) {
        title = title_arg;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;

        if (other instanceof Book) {
            Book otherbook = (Book) other;
            return title.equals(otherbook.title);
        }
        else {
            return false;
        }
    }

    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.title);
    }
}
