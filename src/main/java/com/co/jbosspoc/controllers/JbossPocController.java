/**
 * 
 */
package com.co.jbosspoc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alobaton
 *
 */
@RestController
public class JbossPocController {

	@RequestMapping("/hello-world")
	String hello() {
		return "Hello world";
	}
}
