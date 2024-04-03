package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(">>");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		Add add = new Add();
		add.setValue(num1, num2);
		System.out.println(">>" + add.calculate());
 
		Sub sub = new Sub();
		sub.setValue(num1, num2);
		System.out.println(">>" + sub.calculate());

		Div div = new Div();
		div.setValue(num1, num2);
		System.out.println(">>" + div.calculate());

		Mul mul = new Mul();
		mul.setValue(num1, num2);
		System.out.println(">>" + mul.calculate());

		scanner.close();  

	}
}
