package com.number.util;

public class NumberToWords {

	private final String[] oneToNineteen = { "Zero", "One", "Two", "Three",
			"Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
			"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
			"Seventeen", "Eighteen", "Nineteen" };

	private final String[] tensWords = { "Twenty", "Thirty", "Forty", "Fifty",
			"Sixty", "Seventy", "Eighty", "Ninety" };

	private final String[] bigWords = { "Thousand" }; // For wide range numbers add million & billion in this array

	public NumberToWords() {

	}
	//Convert numbers (100-999)
	private String convert999(int num) {
		String word = oneToNineteen[(int) (num / 100)] + " Hundred";
		String word1 = convert99(num % 100);
		if (num <= 99) {
			return word1;
		} else if (num % 100 == 0) {
			return word;
		} else {
			return word + " and " + word1;
		}
	}
	//Convert numbers (1-99)
	private String convert99(int num) {
		if (num < 20) {
			return oneToNineteen[(int) num];
		}
		String word = tensWords[(int) (num / 10 - 2)];
		if (num % 10 == 0) {
			return word;
		}
		return word + "-" + oneToNineteen[(int) (num % 10)];
	}
	/* *
	 * This is used to convert numbers to English word 
	 * Created/Modified @ 17-01-2015
	 * Author : Berchmans Arul
	 * */
	public String numbersToWordsConverter(int number) {
		String words = "";
		if (number < 0) {
			return "Please Enter Positive Numbers";
		}
		if (number <= 999) {
			return convert999(number);
		}
		int t = 0;
		while (number > 0) {
			if (number % 1000 != 0) {
				String words1 = convert999(number % 1000);
				if (t > 0) {
					words1 = words1 + " " + bigWords[t - 1];
				}
				if (words == null) {
					words = words1;
				} else {
					words = words1 + " " + words;
				}
			}
			number /= 1000;
			t++;
		}
		return words;
	}

}
