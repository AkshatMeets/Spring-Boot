package com.weatherapi.demo.services;


import com.weatherapi.demo.Api.UserApiClient;
import com.weatherapi.demo.entities.User;
import com.weatherapi.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserApiClient userApiClient;

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userApiClient.getAllUsers();
    }

    public User createUser(User user) {
        return userApiClient.createUser(user);
    }

    public User updateUser(Long id, User user) {
        return userApiClient.updateUser(id, user);
    }

    public void deleteUser(Long id) {
        userApiClient.deleteUser(id);
    }
    public String syncUsersFromExternalApi() {
        List<User> users = userApiClient.getAllUsers();
        userRepository.saveAll(users);
        return "Synced " + users.size() + " users from external API.";
    }
}
