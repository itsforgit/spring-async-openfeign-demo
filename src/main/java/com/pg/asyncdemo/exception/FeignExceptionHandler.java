package com.pg.asyncdemo.exception;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class FeignExceptionHandler {

	@ExceptionHandler(CustomeException.class)
	public Map<String, Object> handleFeignStatusException(CustomeException e, HttpServletResponse response) {
		response.setStatus(e.getStatus());
		return new JSONObject(e.getResponse()).toMap();
	}
}
