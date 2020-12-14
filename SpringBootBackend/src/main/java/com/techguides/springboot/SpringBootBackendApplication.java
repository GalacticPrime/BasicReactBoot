package com.techguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techguides.springboot.model.User;
import com.techguides.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringBootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Victor","Secret","Whatsecret@gmail.com"));
		this.userRepository.save(new User("Keanu","Reeves","johnwick@gmail.com"));
		this.userRepository.save(new User("John","Cena","invisible@gmail.com"));
	}

}
