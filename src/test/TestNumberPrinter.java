package test;

import java.util.Scanner;

import org.junit.Test;

import com.number.print.NumberPrinter;


public class TestNumberPrinter {
	NumberPrinter numberPrinter = new NumberPrinter();
	/* *
	 * This Test method is used to test converting numbers
	 * Created/Modified @ 17-01-2015
	 * Author : Berchmans Arul
	 * */
	@Test
	public void testRoman(){
		Scanner scan = new Scanner(System.in);
		numberPrinter.convertNumbers(scan);
	}
	
	
}
