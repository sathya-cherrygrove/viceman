package com.wordselector.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Repository;

@Repository
@Entity
public class wordbase {

	@Id
	@GeneratedValue
	private Integer id;
	private String word;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "wordbase [id=" + id + ", word=" + word + "]";
	}

}
