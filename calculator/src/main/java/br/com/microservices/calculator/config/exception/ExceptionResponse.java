package br.com.microservices.calculator.config.exception;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class ExceptionResponse implements Serializable {

	private LocalDateTime timeStamp;
	private String message;
	private String details;

}
