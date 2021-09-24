package br.com.microservices.calculator.math;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Component;

@Component
public class MathOperator {

	public Double plus(Double n1, Double n2) { return n1 + n2; }

	public Double minus(Double n1, Double n2) {
		return n1 - n2;
	}

	public Double multi(Double n1, Double n2) {
		return n1 * n2;
	}

	public Double div(Double n1, Double n2) {
		return n1 / n2;
	}

	public Double sqrt(Double n1) {
		return Math.sqrt(n1);
	}
}
