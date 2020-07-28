package com.coldmater.thymeleaf_tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

@Controller
public class SampleController {

    @GetMapping("/sample")
    public String sample(Model model){
        model.addAttribute("name", "chanwool");
        model.addAttribute("today", LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE));
        return "sample";
    }
}
