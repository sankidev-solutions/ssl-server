package com.sankidev.tls.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class ServerController {
	
	Logger log = LoggerFactory.getLogger(ServerController.class);
	
	@GetMapping("/hello")
	public String hello() {
		log.info("app : server, event: getting hello message");
		return "hello from server";
	}
}
