/**
 * 
 */
package com.co.jbosspoc.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alobaton
 *
 */
@RestController
public class JbossPocController {

	@RequestMapping("/hello-world/{name}")
	public String hello(@PathVariable String name) {
		return String.format("Hello %s!", name);
	}
}
