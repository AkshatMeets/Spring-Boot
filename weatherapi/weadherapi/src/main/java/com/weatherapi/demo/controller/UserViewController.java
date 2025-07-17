package com.weatherapi.demo.controller;

import com.weatherapi.demo.entities.User;
import com.weatherapi.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserViewController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String getUsersPage(Model model) {
        List<User> users = userService.getUsers();
        model.addAttribute("users", users);
        return "users";
    }
}
