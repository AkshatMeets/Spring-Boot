package com.springboot.springbootproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/")
    public String home(){
        System.out.println("This is Home page");
        return "home";
    }

    @RequestMapping("/contact")
    public String contact(){
        System.out.println("this is contact");
        return "contact";
    }
}
