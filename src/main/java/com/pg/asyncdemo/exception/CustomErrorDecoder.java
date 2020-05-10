package com.pg.asyncdemo.exception;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {
	@Override
	public Exception decode(String methodKey, Response response) {

		return new CustomeException(response.status(), response.reason());
	}

}
