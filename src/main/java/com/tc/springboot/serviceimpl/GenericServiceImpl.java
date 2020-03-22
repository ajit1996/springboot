package com.tc.springboot.serviceimpl;

import org.springframework.stereotype.Service;

import com.tc.springboot.service.GenericService;

@Service
public class GenericServiceImpl<T,R> implements GenericService{

	@Override
	public Object process(Object domain, String message) {
		return "Hello World..!";
	}

}
