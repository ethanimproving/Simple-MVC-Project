package com.improving.bootcamp;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Random;

public class HelloTag extends SimpleTagSupport {

    private String name;

    public void doTag() throws IOException {
        JspWriter out = getJspContext().getOut();
        boolean morning = new Random().nextBoolean();
        String message = (morning) ? "Hello" : "Goodbye";
        out.println(message + " " + name + "!");
    }

    public void setName(String name) {
        this.name = name;
    }
}
