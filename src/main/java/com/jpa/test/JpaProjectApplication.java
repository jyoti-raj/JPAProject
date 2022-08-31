package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.dao.UserRepository;
import com.jpa.entities.User;


@SpringBootApplication(scanBasePackages = "com.jpa")
public class JpaProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaProjectApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User user = new User();
		user.setName("jyoti");
		user.setCourse("Computer science");
		user.setEmail("jyoti123@yahoo.com");
		
//		try {
			User user1 = userRepository.save(user);
			System.out.println(user1);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
