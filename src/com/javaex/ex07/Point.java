package com.javaex.ex07;

// 아래의 프로그램에서 Point의 정의는 x값이 같으면 같은 Point로 정의합니다.
public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// equals() 메소드를 작성하세요.

	@Override
	public boolean equals(Object obj) {
		if (this == obj) { // 참조가 같으면 true 반환
			return true;
		}
		if (obj instanceof Point) { // obj가 Point 클래스의 인스턴스인지 확인
			Point other = (Point) obj; // obj를 Point 타입으로 캐스팅
			if (this.x == other.x) {
				return true;
			}
		}
		return false; // 위 조건에 해당하지 않으면 false 반환
	}

}
