package com.example.basic;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework. test.web.servlet. result. MockMvcResultHandlers.print;
import static org.springframework. test.web. servlet.result. MockMvcResultMatchers. content;
import static org. springframework. test.web.servlet.result. MockMvcResultMatchers. status;

import static org.springframework. test.web.servlet. request. MockMvcRequestBuilders.get;


@SpringBootTest
@AutoConfigureMockMvc
class BasicApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void returnDefault() throws Exception{
		this.mockMvc.perform(get("/"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string("Hello world"));
	}

}
