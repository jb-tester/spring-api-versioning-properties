package com.mytests.spring.springapiversioningproperties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/annotated")
public class AnnotatedController {

	@GetMapping(path = "/test1/{id}", version = "1.1")
	public String getTest11WithPathVariable(@PathVariable String id) {
		return "annotated test1 with path variable "+id+", version 1.1";
	}
	@GetMapping(path = "/test1/{id}", version = "1.2")
	public String getTest12WithPathVariable(@PathVariable String id) {
		return "annotated test1 with path variable "+id+", version 1.2";
	}
	@GetMapping(path = "/test1/{id}", version = "1.3")
	public String getTest13WithPathVariable(@PathVariable String id) {
		return "annotated test1 with path variable "+id+", version 1.3";
	}
}