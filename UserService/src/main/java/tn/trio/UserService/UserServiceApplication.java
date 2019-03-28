package tn.trio.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import tn.trio.UserService.dao.UserDao;
import tn.trio.UserService.entities.User;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
		
		
	}

}
