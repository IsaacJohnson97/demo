package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
    public class FormController {


    @GetMapping("/form")
    public String GetForm(){
        return "index";
    }

    @PostMapping(value = "/index")
    public String submit(@RequestParam String question, String answer, Model model) {


        model.addAttribute("question", question);
        model.addAttribute("answer", answer);

        return "result";
    }


}




