package com.chess.utils;

public class StringUtils {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static String appendNewLine(String originalString) {

		StringBuffer sbf = new StringBuffer();
		sbf.append(originalString);
		sbf.append(LINE_SEPARATOR);

		return sbf.toString();

	}

}
