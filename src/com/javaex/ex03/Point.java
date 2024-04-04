package com.javaex.ex03;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//toString()을 작성 하세요
	@Override
	public String toString() {
		// 출력 문자열 형식 반환
		return String.format("포인트 [x: " + x + ", y: " + y + " 입니다]");
	}

	
	

}
