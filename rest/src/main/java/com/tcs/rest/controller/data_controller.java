package com.tcs.rest.controller;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.tcs.rest.bean.data;
import com.tcs.rest.jpa_repo.repository;

@RestController
public class data_controller {
	@Autowired 
	private repository repo;
	//http:localhost:8080/data
	@GetMapping("/data")
	public List<data> getcourses(){
	//1-GET METHOD
		return repo.findAll();
	}
	//2-FIND BY ID METHOD
	@GetMapping("/data/{id}")
	public data getCourseDetails(@PathVariable int id) {
		Optional<data> emp_data=repo.findById(id);
			if(emp_data.isEmpty()) {
				throw new RuntimeException("ERROR WITH ID " + id);
			}
			return emp_data.get();
		}
		
		
		

}
