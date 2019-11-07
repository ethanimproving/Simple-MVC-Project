package com.improving.bootcamp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class SimpleController {

    @RequestMapping("/home")
    public String home(ModelMap model) {
        model.put("message", getMessage());
        model.put("name", "Boot Camp!");
        model.put("books", bookList());
        return "home";
    }

    private String getMessage() {
        boolean morning = new Random().nextBoolean();
        return (morning) ? "Hello" : "Goodbye";
    }

    private List<Book> bookList() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Holy Bible", "God"));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book("Journal", "Ethan Miller"));
        return books;
    }
}
