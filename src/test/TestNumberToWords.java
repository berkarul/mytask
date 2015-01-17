package test;

import org.junit.Assert;
import org.junit.Test;

import com.number.util.NumberToWords;

public class TestNumberToWords {

	NumberToWords numbertowords = new NumberToWords();
	/* *
	 * This Test method is used to test converting number to words
	 * Created/Modified @ 17-01-2015
	 * Author : Berchmans Arul
	 * */
	@Test
	public void testNumberToWords() {
		int number = 25;
		String word = numbertowords.numbersToWordsConverter(number);
		Assert.assertNotNull(word);
		Assert.assertEquals("Twenty-Five", word);
	}
}
