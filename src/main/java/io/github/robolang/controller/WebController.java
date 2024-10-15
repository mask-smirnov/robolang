package io.github.robolang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @RequestMapping("/")
    public String index() {
        return "index"; // Render the index.html template
    }

    @PostMapping("/submit")
    public String handleSubmit(@RequestParam("textField") String textField, Model model) {
        model.addAttribute("submittedText", textField); // Pass the text to the view
        return "index"; // Reload the same page with the text displayed
    }
}
