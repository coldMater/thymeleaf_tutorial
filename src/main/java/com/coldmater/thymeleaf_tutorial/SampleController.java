package com.coldmater.thymeleaf_tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Controller
public class SampleController {

    @GetMapping("/sample")
    public String sample(Model model){
        model.addAttribute("name", "chanwool");
        model.addAttribute("today", LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE));

        model.addAttribute("yesterday", LocalDate.now());

        User user = new User("coldmater", 14);
        model.addAttribute(user);

        List<User> userList = new ArrayList();
        userList.add(user);
        userList.add(user);
        userList.add(user);
        userList.add(user);
        model.addAttribute("prods", userList);


        return "sample";
    }

    @GetMapping("/another")
    public String anotherQS(Model model, @RequestParam Long id){
        model.addAttribute("id", id);
        return "another";
    }

    @GetMapping("/another/{pathId}")
    public String anotherPV(Model model, @PathVariable String pathId){
        model.addAttribute("pathId", pathId);
        return "another";
    }
}

