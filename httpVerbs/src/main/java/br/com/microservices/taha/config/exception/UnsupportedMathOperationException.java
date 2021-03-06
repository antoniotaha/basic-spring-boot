package br.com.microservices.taha.config.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationException extends RuntimeException {

	public UnsupportedMathOperationException(String exception) {
		super(exception);
	}
}
