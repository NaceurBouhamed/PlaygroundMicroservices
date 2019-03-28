package tn.trio.UserService.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.trio.UserService.dao.UserDao;
import tn.trio.UserService.entities.User;

@CrossOrigin
@RestController
public class HelloController {
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	DiscoveryClient dc;
	
	private AtomicLong counter = new AtomicLong();

	@GetMapping("/hello")
	public String getHelloWorld() {
		return "Hello from User #" + counter.incrementAndGet();
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
		userDao.saveAndFlush(new User("Gn","Kh"));
		userDao.saveAndFlush(new User("Wa","Kc"));
		userDao.saveAndFlush(new User("Na","Bo"));
		userDao.saveAndFlush(new User("Ni","So"));
		return userDao.findAll();
	}
	
	@GetMapping("/project")
	public String getProjectApi() {
		return dc.getInstances("project-service").get(0).getUri().toString();
	}
}
