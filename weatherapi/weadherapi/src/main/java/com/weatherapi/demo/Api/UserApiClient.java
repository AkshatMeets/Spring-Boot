package com.weatherapi.demo.Api;


import com.weatherapi.demo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class UserApiClient {

    @Value("${external.api.users-url}")
    private String apiUrl;

    @Autowired
    private RestTemplate restTemplate;

    public List<User> getAllUsers() {
        User[] users = restTemplate.getForObject(apiUrl, User[].class);
        return Arrays.asList(users);
    }

    public User createUser(User user) {
        return restTemplate.postForObject(apiUrl, user, User.class);
    }

    public User updateUser(Long id, User user) {
        String url = apiUrl + "/" + id;
        restTemplate.put(url, user);
        return user;
    }

    public void deleteUser(Long id) {
        String url = apiUrl + "/" + id;
        restTemplate.delete(url);
    }
}

