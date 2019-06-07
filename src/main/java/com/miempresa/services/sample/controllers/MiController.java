package com.miempresa.services.sample.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miempresa.services.sample.pojos.ResultObjectSample;

@RestController
public class MiController {

	@GetMapping("/")
	List<ResultObjectSample> firstMethodController() {

		return Arrays.asList(new ResultObjectSample("valueName1", "valueDescription1"),
				new ResultObjectSample("valueName2", "valueDescription2"));
	}

	@SuppressWarnings("serial")
	@GetMapping("/rest1")
	ResponseEntity<?> secondMethodController() {

		return ResponseEntity.ok(Arrays.asList(new HashMap<String, String>() {
			{
				put("name", "valueName1");
				put("description", "valueDescription1");
			}
		}, new HashMap<String, String>() {
			{
				put("name", "valueName2");
				put("description", "valueDescription2");
			}
		}));
	}

}
