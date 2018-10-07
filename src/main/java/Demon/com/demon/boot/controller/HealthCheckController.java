package Demon.com.demon.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service/health")
public class HealthCheckController {
	
	@GetMapping("check")
	public String test() {
		return "successful";
	}

}
