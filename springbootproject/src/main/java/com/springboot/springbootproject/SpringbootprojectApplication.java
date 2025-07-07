package com.springboot.springbootproject;

import com.springboot.springbootproject.dao.UserRepository;
import com.springboot.springbootproject.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@SpringBootApplication
public class SpringbootprojectApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringbootprojectApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

//		User user2 = new User();
//		user2.setName("Akshat");
//		user2.setCity("surat");
//		user2.setStatus("Java");
//
//		User user2 = userRepository.save(user2);
//		System.out.println(user2);

		//create object for user2
		User user1 = new User();
		user1.setName("Aksshhat");
		user1.setCity("city1");
		user1.setStatus("php");

		User user2 = new User();
		user2.setName("mohit");
		user2.setCity("city2");
		user2.setStatus("java");

//		save multiple object
//		User resultUser = userRepository.save(user2);
//		List<User> users= List.of(user2,user1);
//		Iterable<User> result =userRepository.saveAll(users);
//
//		result.forEach(user -> {
//			System.out.println(user);
//		});

//		System.out.println("saved user" +resultUser);
		System.out.println("done");

		//update
//		Optional<User> optional = userRepository.findById(1);
//		User user = optional.get();
//
//		user.setName("Varun");
//		User result = userRepository.save(user);
//
//		System.out.println(result);

		//Get data

//		method:1 to get data
		Iterable<User> itr = userRepository.findAll();
//		itr.forEach(new Consumer<User>() {
//			@Override
//			public void accept(User user) {
//				System.out.println(user);
//			}
//		});

//		method :2 to get data
//		itr.forEach(user -> {
//			System.out.println(user);
//		});

//		delete
//		userRepository.deleteById(4);
//		System.out.println("deleted");

//		Iterable<User> allUsers = userRepository.findAll();
//		allUsers.forEach(user -> System.out.println(user) );
//		userRepository.deleteAll(allUsers);
//
//		List<User> users = userRepository.findByName("mohit");
//		users.forEach(e -> System.out.println(e));
//		List<User> users = userRepository.findByNameAndCity("mohit","city2");
//		users.forEach(e -> System.out.println(e));

		List<User> allUser = userRepository.getAllUser();
		allUser.forEach(user -> System.out.println(user));

		System.out.println("--------------------------------------------------------------");
		List<User> userByName = userRepository.getUserByName("mohit","city2");
		userByName.forEach(user -> System.out.println(user));
		System.out.println("--------------------------------------------------------------");

		userRepository.getUsers().forEach(user -> System.out.println(user));
	}
}
