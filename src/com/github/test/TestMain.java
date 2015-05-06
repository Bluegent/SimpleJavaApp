package com.github.test;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args){
		System.out.println("Hello, world!");
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.print("Input times:");
		try {
			n=Utils.tryParseInt(sc.next());
			for(int i=0;i<n;i++){
				System.out.println(Math.random());
			}
		} catch (Exception e) {
			System.out.println("Not a number.");
		}
		sc.close();
	}
}
