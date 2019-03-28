package tn.trio.projectService.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.trio.projectService.dao.ProjectDao;
import tn.trio.projectService.entities.Project;
@RestController
@CrossOrigin
public class HelloController {
	
	@Autowired
	private ProjectDao projectDao;
	
	private AtomicLong counter = new AtomicLong();

	@GetMapping("/hello")
	public String getHelloWorld() {
		return "Hello from Project #" + counter.incrementAndGet();
	}
	
	@GetMapping("/projects")
	public List<Project> getAllProjects(){
		projectDao.save(new Project("sparkys","a1b2c3"));
		projectDao.save(new Project("valeo","c3a1b2"));
		return projectDao.findAll();
	}
	
	@GetMapping("/")
	public String getHello() {
		return "Hello from Project #" + counter.incrementAndGet();
	}
	


}
