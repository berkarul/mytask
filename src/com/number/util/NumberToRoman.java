package com.number.util;

public class NumberToRoman {

	private int[] numbers = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900,
			1000 };
	private String[] letters = { "I", "IV", "V", "IX", "X", "XL", "L", "XC",
			"C", "CD", "D", "CM", "M" };

	public NumberToRoman() {

	}
	/* *
	 * This method is used to convert numbers to Roman letters
	 * Created/Modified @ 17-01-2015
	 * Author : Berchmans Arul
	 * */
	public String convertNumberToRomanLetters(int number) {
		String romanLetter = "";
		int num = number;

		for (int i = numbers.length - 1; i >= 0; i--) {
			while (num >= numbers[i]) {
				romanLetter += letters[i];
				num -= numbers[i];
			}
		}
		return romanLetter;
	}

}
