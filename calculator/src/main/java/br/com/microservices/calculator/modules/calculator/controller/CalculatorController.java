package br.com.microservices.calculator.modules.calculator.controller;

import static br.com.microservices.calculator.utils.CalculatorUtils.convertToDouble;
import static br.com.microservices.calculator.utils.CalculatorUtils.isNumeric;

import lombok.AllArgsConstructor;

import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservices.calculator.config.exception.UnsupportedMathOperationException;
import br.com.microservices.calculator.math.MathOperator;

@RestController
@AllArgsConstructor
@RequestMapping("/api/calculator")
public class CalculatorController {

	private final MathOperator math;

	@GetMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Set numeric value");
		}

		return math.plus(convertToDouble(numberOne), convertToDouble(numberTwo));
	}

	@GetMapping("/sub/{numberOne}/{numberTwo}")
	public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Set numeric value");
		}

		return math.minus(convertToDouble(numberOne) , convertToDouble(numberTwo));
	}

	@GetMapping("/div/{numberOne}/{numberTwo}")
	public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Set numeric value");
		}

		return math.div(convertToDouble(numberOne), convertToDouble(numberTwo));
	}

	@GetMapping("/multi/{numberOne}/{numberTwo}")
	public Double multi(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Set numeric value");
		}

		return math.multi(convertToDouble(numberOne), convertToDouble(numberTwo));
	}

	@GetMapping("/sqrt/{numberOne}")
	public Double sum(@PathVariable("numberOne") String numberOne) {
		if(!isNumeric(numberOne)) {
			throw new UnsupportedMathOperationException("Set numeric value");
		}

		return math.sqrt((convertToDouble(numberOne)));
	}
}
