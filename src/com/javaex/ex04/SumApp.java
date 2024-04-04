
package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		// 코드를 작성하세요
		// 입력받은 문자열을 공백을 기준으로 분리하여 문자열 배열로 저장
		String[] numbers = numLine.split(" ");
		
		// 문자열 배열에 있는 각 숫자를 정수로 변환하여 합산
		for(String number : numbers) {
			sum += Integer.parseInt(number);		// 문자열로 표현된 숫자를 정수로 변환
		}
		
//		for (int i=0; i < data.length; i++) {			// 이렇게 써도 됨
//			int num = Integer.parseInt(data[i]);
//		}
		
		
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}

