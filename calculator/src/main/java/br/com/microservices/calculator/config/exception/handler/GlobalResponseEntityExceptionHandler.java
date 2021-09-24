package br.com.microservices.calculator.config.exception.handler;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.microservices.calculator.config.exception.ExceptionResponse;
import br.com.microservices.calculator.config.exception.UnsupportedMathOperationException;

@RestController
@ControllerAdvice
public class GlobalResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler({Exception.class})
	public final ResponseEntity<ExceptionResponse> handleAllException(Exception ex, WebRequest request) {
		ExceptionResponse exceptionResponse = new ExceptionResponse(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
		return ResponseEntity.internalServerError().body(exceptionResponse);
	}

	@ExceptionHandler({ UnsupportedMathOperationException.class})
	public final ResponseEntity<ExceptionResponse> handleBadRequestException(UnsupportedMathOperationException ex, WebRequest request) {
		ExceptionResponse exceptionResponse = new ExceptionResponse(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
		return ResponseEntity.badRequest().body(exceptionResponse);
	}
}

