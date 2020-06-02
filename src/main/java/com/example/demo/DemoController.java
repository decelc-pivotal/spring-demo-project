package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoController {

	@GetMapping("/hello")
		public String hello() {
			return "hello";
		}
}
