package example.smallest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

@Controller
@RequestMapping("welcome")
public class WelcomeController {
	
	
	@Autowired
    private Environment env;

    @Value("${welcome.message}")
    private String welcomeMessage;


	@GetMapping("message")
	public ResponseEntity<String> getCategories() {

		//String welcomeMessage="Hello Blue World !!!";
		System.out.println("welcome message is :" + welcomeMessage);
		return new ResponseEntity<String>(welcomeMessage, HttpStatus.OK);
	}
}