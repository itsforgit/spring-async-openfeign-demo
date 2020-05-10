package com.pg.asyncdemo.openfeign;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pg.asyncdemo.exception.CustomErrorDecoder;

import feign.Logger;
import feign.codec.ErrorDecoder;
import feign.okhttp.OkHttpClient;

@Configuration
public class JsonplaceholderConfig {

	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.BASIC;
	}

	@Bean
	public OkHttpClient client() {
		return new OkHttpClient();
	}

	@Bean
	public ErrorDecoder errorDecoder() {
		return new CustomErrorDecoder();
	}

}
