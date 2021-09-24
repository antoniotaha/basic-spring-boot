package br.com.microservices.calculator.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class CalculatorUtils {

	public static boolean isNumeric(String number) {
		return NumberUtils.isCreatable(number);
	}

	public static Double convertToDouble(String number) {
		return isNumeric(number) ? Double.parseDouble(number) : 0D;
	}
}
