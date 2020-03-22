package com.tc.springboot.service;

import org.springframework.stereotype.Service;

public interface GenericService<T, R> {
	R process(T domain, String message);
}
