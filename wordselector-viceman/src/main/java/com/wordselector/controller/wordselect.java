package com.wordselector.controller;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wordselector.model.randomword;
import com.wordselector.repository.wordbase;
import com.wordselector.services.JpaDatabaseInstance;

@RestController
public class wordselect {

	@Autowired
	private JpaDatabaseInstance h2instance;

	@Autowired
	DiscoveryClient discoveryclient;

	@RequestMapping("/findAllWords")
	public List<wordbase> findAllWords() {

		return h2instance.findAll();

	}

	@RequestMapping("/findOneWord/{Id}")
	public Optional<wordbase> findOneWord(@PathVariable("Id") Integer Id) {

		return h2instance.findById(Id);

	}

	@RequestMapping("/putWord")
	public String putWord(@RequestBody wordbase wordb) {

		h2instance.save(wordb);
		return "Word Saved Successfully : " + findAllWords();

	}

	@RequestMapping("/callRandomWord")
	public Optional<wordbase> callRandomWord() {
		Random randomvalue = new Random();
		int count = (int) h2instance.count();
		return h2instance.findById(randomvalue.nextInt(count) + 1);

	}

	@RequestMapping("/findRandomMeaning")
	public String findRandomMeaning() {
		try {
			List<ServiceInstance> worddataservice = discoveryclient.getInstances("datamuse-viceman");
			ServiceInstance si = worddataservice.get(0);
			String url = si + "/getWordMeaning/{word}";
			Random randomvalue = new Random();
			int count = (int) h2instance.count();
			Optional<wordbase> wordselect = h2instance.findById(randomvalue.nextInt(count) + 1);
			wordbase wb = wordselect.get();
            return "wordselector-viceman-findrandommeaning " + si.getUri().toString()+ " Word :"+ wb.getWord();

		}

		catch (Exception e) {
			return "Service instance returned null value. Unable to find any service - " + e.getMessage();
		}

	}

}
