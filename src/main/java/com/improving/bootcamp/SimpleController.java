package com.improving.bootcamp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Random;

@Controller
public class SimpleController {

    private BookRepository bookRepository = new BookRepository();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(ModelMap model) {
        model.put("book", new Book("",""));
        setCommonModelAttributes(model);
        return "home";
    }

    private void setCommonModelAttributes(ModelMap model) {
        model.put("message", getMessage());
        model.put("name", "Boot Camp");
        model.put("books", bookRepository.getBooks());
    }

    @PostMapping("/add")
    public String add(ModelMap model, @Valid @ModelAttribute("book") Book book, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("Error!");
            setCommonModelAttributes(model);
            return "home";
        }
        bookRepository.add(book);
        return "redirect:/";
    }

    private String getMessage() {
        boolean morning = new Random().nextBoolean();
        return (morning) ? "Hello" : "Goodbye";
    }

    @GetMapping("/bad")
    public String badRequest() {
        throw new RuntimeException("Something went wrong");
    }

}
