package com.codezup.sso.springboot.octa;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class DemoApplication {

	@GetMapping("/")
	public String welcomeInCodezupWorld(Principal principal) {
		String success = "Login Success: welcome " + principal.getName() + "" + " to Codezup World !";
		String exploreNewThings = "Here you find new learning opportunities";
		return success + " " + exploreNewThings;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
