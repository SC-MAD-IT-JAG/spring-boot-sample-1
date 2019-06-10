package com.miempresa.services.sample.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.miempresa.services.sample.controllers.MyController;

@RunWith(SpringRunner.class)
@WebMvcTest(MyController.class)
public class MyFirstSpringBootTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void firstTest() throws Exception {
		mockMvc.perform(get("/rest1")).andExpect(status().isOk())
				.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));

//		mockMvc.perform(get("/rest1")).andExpect(status().isOk())
//				.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON)).andExpect(content().json(
//						"[{\"name\":\"valueName1\",\"description\":\"valueDescription1\"},{\"name\":\"valueName2\",\"description\":\"valueDescription2\"}]"));

	}
}
