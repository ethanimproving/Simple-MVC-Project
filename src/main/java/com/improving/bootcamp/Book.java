package com.improving.bootcamp;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

public class Book {
    @NotEmpty(message = "Enter a title, idiot")
    private final String title;

    @NotEmpty(message = "Clearly this wasn't written by no one")
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return this.title + " by " + this.author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
