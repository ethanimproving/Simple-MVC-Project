package com.improving.bootcamp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookRepository {
    private final List<Book> books = new ArrayList<>();

    public BookRepository() {
        books.add(new Book("The Holy Bible", "God"));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book("Journal", "Ethan Miller"));
    }

    public void add(Book book) {
        books.add(book);
    }

    public void remove(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }
}
