package com.library;

import java.time.LocalDate;

public class TestLibrary {
    public static void main(String[] args) {
        Reader john = new Reader("John", "Ivanovich", "Rambo", 56, "It",
                LocalDate.now(), "067");

        john.takeBook(5);
        john.takeBook("Adventures", "Scares", "Loves");

        Author author1 = new Author("Jack", "Sergeivich", "Rambo1");
        Author author2 = new Author("Ben", "John", "Rambo2");

        Book book1 = new Book("Adventurre of Ann", author1);
        Book book2 = new Book("Walk at night", author2);

        john.takeBook(book1, book2);
    }
}
