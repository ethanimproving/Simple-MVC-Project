package com.improving.bootcamp;

import com.improving.bootcamp.client.BookClient;
import com.improving.bootcamp.client.Volumes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class BookRepository {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final List<Book> books = new ArrayList<>();

    private BookClient bookClient;

    public BookRepository(BookClient bookClient) {
        this.bookClient = bookClient;
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

    @PostConstruct
    public void initialize() {
        Volumes volumes = this.bookClient.volumeSearch("F. Scott Fitsgerald");
        logger.info("Volume size: {}", volumes.getItems().size());
        books.add(new Book("The Holy Bible", "God"));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book("Journal", "Ethan Miller"));
    }
}
