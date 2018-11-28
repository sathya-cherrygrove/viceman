package com.viceman.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.viceman.model.synonym;

@Component
@RestController
public class DatamuseApiCalls {

	RestTemplate resttemplate = new RestTemplate();

	@RequestMapping("/getWordMeaning/{word}")
	public String getWordMeaning(@PathVariable("word") String word) {
		String url = "https://api.datamuse.com/words?ml=" + word;

		ResponseEntity<List<synonym>> response = resttemplate.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<synonym>>() {
				});

		List<synonym> wordlist = response.getBody();
		String wordResponse = "";
		wordResponse = wordlist.stream().limit(5).map(x -> x.getWord()).collect(Collectors.joining("  "));
		return "Service: datamuse-viceman-getwordmeaning|" +"word :"+ word + " Word Meaning : " + wordResponse;

	}

}
