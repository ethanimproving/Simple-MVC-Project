package com.improving.bootcamp;

import javax.validation.constraints.NotEmpty;

public class Book {
    private float price;

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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
