package com.mx.ingenia.util;

import java.util.Random;

public class RandomUtils {

	public static String randomElement( String[] elements)
	{
		Random randNumber = new Random();
		String result = elements[randNumber.nextInt(3)];
		return result;
		
	}
}
