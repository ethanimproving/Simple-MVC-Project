package com.improving.bootcamp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {

    @RequestMapping("/home")
    public String home(ModelMap model) {
        model.put("name", "World");
        return "home";
    }
}
