package com.improving.bootcamp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class SimpleController {

    private BookRepository bookRepository = new BookRepository();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(ModelMap model) {
        model.put("book", new Book("",""));
        model.put("message", getMessage());
        model.put("name", "Boot Camp");
        model.put("books", bookRepository.getBooks());
        return "home";
    }

    @PostMapping("/add")
    public String add(ModelMap model, @ModelAttribute Book book) {
        bookRepository.add(book);
        return "redirect:/";
    }

    private String getMessage() {
        boolean morning = new Random().nextBoolean();
        return (morning) ? "Hello" : "Goodbye";
    }


}
