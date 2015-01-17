package test;

import org.junit.Assert;
import org.junit.Test;

import com.number.util.NumberToRoman;

public class TestNumberToRoman {

	NumberToRoman numbertoroman = new NumberToRoman();
	/* *
	 * This Test method is used to test converting number to roman
	 * Created/Modified @ 17-01-2015
	 * Author : Berchmans Arul
	 * */
	@Test
	public void testNumberToRoman() {
		int number = 55;
		String roman = numbertoroman.convertNumberToRomanLetters(number);
		Assert.assertNotNull(roman);
		Assert.assertEquals("LV", roman);
	}

}
