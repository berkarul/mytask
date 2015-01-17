package com.number.print;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.number.util.NumberToRoman;
import com.number.util.NumberToWords;

public class NumberPrinter {
	/* *
	 * This method used to get the input from user, 
	 * Validate the input and convert numbers as per the Format
	 * Created/Modified @ 17-01-2015
	 * Author: Berchmans Arul  
	 * */
	public void convertNumbers(Scanner input){
		int number;
		String format = "";
		System.out.println("Please Enter Number (1-3999)");
		//Number input
		number = input.nextInt();
		if(number < 1){
	    	   throw new NumberFormatException("Please Enter Positive Numbers Only."); 
		}else if(number > 3999){
			System.out.println("Please Enter Less Than or Equal 3999");
			number = input.nextInt();
		}
		System.out.println("Please Enter Format (WORDS or ROMAN)");
		//Format input
		format = input.next();
		//Checking Format to convert numbers
		if(format.equalsIgnoreCase("WORDS")){
			NumberToWords convertWord = new NumberToWords();
			String word = convertWord.numbersToWordsConverter(number);
			System.out.println(number+"'s English Word is  "+'"'+ word+'"');
		}else if(format.equalsIgnoreCase("ROMAN")){
			NumberToRoman convertRoman = new NumberToRoman();
			String roman =convertRoman.convertNumberToRomanLetters(number);
			System.out.println(number+"'s Roman Letter is  "+'"'+ roman+'"');
		}else{
			System.out.print("Please Enter Valid Format \n");
		}
	
	}
	public NumberPrinter(){
		
	}
	/* *
	 * Main method to get inputs and Convert numbers
	 * Created/Modified @ 17-01-2015
	 * Author : Berchmans Arul
	 * */
	public static void main(String[] args) {
		System.out.println("*** Welcome to Number Printer ***");
		System.out.println("Please follow the instructions");
		System.out.println("Enter a number between 1 and 3999 & Enter Format WORDS or ROMAN");
		System.out.println("Please Enter 'EXIT' to Exit ");
		Scanner input = new Scanner(System.in);
		while(true){
			try {
				NumberPrinter numberPrinter = new NumberPrinter();
				numberPrinter.convertNumbers(input);
			} catch (InputMismatchException e) {
				if (input.next().equalsIgnoreCase("EXIT")) {
					break;
				}
				System.out.print("Please Enter Valid Number \n");
			} catch (NumberFormatException e) {
				System.out.println("Please Enter Valid Number \n");
				System.out.println(e.getMessage());
			}
		} 
		System.out.println("Thank You...");
	}
}
