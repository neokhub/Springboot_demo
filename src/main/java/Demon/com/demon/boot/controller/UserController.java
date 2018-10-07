package Demon.com.demon.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Demon.com.demon.boot.bean.User;

@RestController
@RequestMapping("service/user")
public class UserController {
	
	@RequestMapping(value = "logOn", method = RequestMethod.GET)
	public User logOn() {
		return new User();
	}
}
