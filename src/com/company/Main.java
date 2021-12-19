package com.company;

public class Main {

    public static void main(String[] args) {
        Author andrySap = new Author("Adrew", "Sapkovskii");
        Author joanRouw = new Author("Joan", "Rowling");
        Book witcher = new Book("Last Wish", andrySap, 1993);
        Book harryPotter = new Book("Harry Potter and The Stone", joanRouw, 2000);
        harryPotter.setYearPublic(2001);

        System.out.println(witcher);
        System.out.println(harryPotter);
    }


}
