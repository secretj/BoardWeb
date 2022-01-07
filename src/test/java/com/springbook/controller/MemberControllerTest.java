package com.springbook.controller;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = MemberController.class)
public class MemberControllerTest {
	@Autowired
	private MockMvc mvc;
	@Test
	public void login_test() throws Exception{
		String memberId= "qkrwlsgud890";
		mvc.perform(get("login.do"))
									.andExpect(status().isOk())
									.andExpect(content().string(memberId));
	}
	

}

 												
