package com.springdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.Library;

import com.jspider.userrepository.LibraryRepository;

import jakarta.persistence.Query;

@RestController
public class LibraryController {
//	autowired anootation is used to instanciate the implementing class of libraryRepository interface;

	@Autowired
	LibraryRepository lr;

	@PostMapping("/savelibraryddata")
	public String m2(@RequestBody Library l) {
		lr.save(l);
		return "data saved";
	}

//fetch data using primary key

	@GetMapping("/fetchlibrary")
	public Library getProById(@RequestParam int id) {
		Optional<Library> l = lr.findById(id);
		Library library = l.get();
		return library;
	}
//delete data using primary key

	@DeleteMapping("/deletelibrary")
	public String delete(@RequestParam int id) {
		lr.deleteById(id);
		return "Deta deleted succesfully";
	}
//update the data

	@PutMapping("/updatelibrary")
	public String update(@RequestBody Library l) {
		lr.save(l);
		return "data updated";
	}
//	fetch all data 

	@GetMapping("/findlibrary")
	public List<Library> find() {
		return lr.findAll();
	}

//	find by using author
	@GetMapping("findbyauthor")
	public List<Library> author(@RequestParam String author) {
		return lr.findByAuthor(author);
	}
}
