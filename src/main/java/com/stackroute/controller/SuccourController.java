package com.stackroute.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuccourController {

	@PreAuthorize("hasAnyRole('stakeholder','admin')")
	@RequestMapping({ "/succour" })
	public String firstPage() {
		return "Welcome to Succour";
	}

}