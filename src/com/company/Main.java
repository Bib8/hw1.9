package com.company;

public class Main {

    public static void main(String[] args) {
        Author andrySap = new Author("Adrew", "Sapkovskii");
        Author joanRouw = new Author("Joan", "Rowling");
        Book witcher = new Book("Last Wish", andrySap.getFullName(), 1993);
        Book harryPotter = new Book("Harry Potter and The Stone", joanRouw.getFullName(), 2000);
        harryPotter.setYearPublic(2001);
    }
}
