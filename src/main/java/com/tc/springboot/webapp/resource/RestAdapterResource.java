package com.tc.springboot.webapp.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tc.springboot.serviceimpl.GenericServiceImpl;

@RestController
public class RestAdapterResource {
	
	@Autowired
	GenericServiceImpl genericservice;

	@RequestMapping(value="/restapi/generic")
	public String genericRequestProcess() {
		return (String) genericservice.process("hello", "message");
	}
}
