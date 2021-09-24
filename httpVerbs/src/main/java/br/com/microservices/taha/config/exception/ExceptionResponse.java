package br.com.microservices.taha.config.exception;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ExceptionResponse implements Serializable {

	private LocalDateTime timeStamp;
	private String message;
	private String details;

}
