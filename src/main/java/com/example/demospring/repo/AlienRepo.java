package com.example.demospring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demospring.entity.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{
	
	
	String findByTech(String tech);
}
