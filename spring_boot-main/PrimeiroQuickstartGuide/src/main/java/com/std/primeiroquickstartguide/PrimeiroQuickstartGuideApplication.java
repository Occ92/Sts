package com.std.primeiroquickstartguide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrimeiroQuickstartGuideApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroQuickstartGuideApplication.class, args);
	}
	@GetMapping("/qg")
	public String std1(@RequestParam(value="name", defaultValue="Quickstart Guide Ok") String name) {
		return String.format("%s", name);
	}
}
