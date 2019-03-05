package com.example.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class BookSkipCroller {

	@RequestMapping
	public String index()
	{
		return "index";
	}
}
