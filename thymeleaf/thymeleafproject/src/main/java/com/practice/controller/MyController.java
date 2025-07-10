package com.practice.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model model) {
        System.out.println("Inside about handler...");

        //putting data in model
        model.addAttribute("name","Akshat");
        model.addAttribute("currentDate",LocalDate.now());

        return "about";
    }

    //handling iteration
    @GetMapping("/example-loop")
    public String iterateHandler(Model m) {

    	//create a list
    	List<String> names = List.of("Akshat","laxman","Mohit","Varun");
    	m.addAttribute("names", names);

    	return "iterate";
    }

   //handler for conditional statement

    @GetMapping("/condition")
    public String conditionHandler(Model model) {
    	System.out.println("conditinal handler executed...");
    	model.addAttribute("isActive",false);
    	model.addAttribute("gender","M");
    	return "condition";
    }

    //handler for including fragment

    @GetMapping("/service")
    public String serviceHandler(Model m) {

    	m.addAttribute("title","I like king");
    	m.addAttribute("subtitle",LocalDate.now().toString());
    	return "service";
    }

    //for new about
    @GetMapping("/newAbout")
    public String newAbout() {
    	return "aboutnew";
    }

}