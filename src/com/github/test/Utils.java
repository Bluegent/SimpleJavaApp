package com.github.test;

public class Utils {
	public static int tryParseInt(String str) throws Exception{
		return Integer.parseInt(str);
	}
	public static double random(double bottom, double top){
		return bottom+Math.random()*(top-bottom);
	}
}
