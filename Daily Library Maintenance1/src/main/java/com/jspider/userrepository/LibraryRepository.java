package com.jspider.userrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.Library;

public interface LibraryRepository extends JpaRepository<Library, Integer> {
	
public List<Library> findByAuthor(String author) ;
	

}
