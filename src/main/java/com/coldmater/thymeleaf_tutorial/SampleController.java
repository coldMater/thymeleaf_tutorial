package com.coldmater.thymeleaf_tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Properties;

@Controller
public class SampleController {

    @GetMapping("/sample")
    public String sample(Model model){
        model.addAttribute("name", "chanwool");
        return "sample";
    }
}
