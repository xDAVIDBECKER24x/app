package com.infotera.app.javaAppCRUD.service;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class ClienteController {

	@GetMapping("cliente")
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Hello World!");
	}
}