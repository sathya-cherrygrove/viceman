package com.wordselector.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wordselector.repository.wordbase;

public interface JpaDatabaseInstance extends JpaRepository<wordbase, Integer> {
	
	

}
