package com.cryppro.orderbookarbitrage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

	@Autowired
	private UniverseRepo repo;
	
	@RequestMapping("/go")
	public void go() {

		Iterable<Universe> universe = repo.findAll();
		
		for(Universe uni : universe) {
			System.out.println(uni.toString());
		}

	}

}
