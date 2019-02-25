package com.ameed.exceptions;

/**
 * Created by: ameed_fah Date: 18-02-2019
 */
public class Converter {

	public int toInteger(String s) throws Exception {
		try {
			return Integer.parseInt(s);
		} catch (NumberFormatException e) {
			throw e;
		} catch (Exception e) {
			throw new NumberFormatException("failed to parse " + s);
		}
	}
}
