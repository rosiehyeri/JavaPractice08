package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		// System.out.println(p1 == p2);: p1과 p2는 서로 다른 객체이므로 메모리 상에 다른 위치에 저장되어 있습니다. 
		// 따라서 == 연산자로 비교하면 false가 출력됩니다.
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		// System.out.println(p1.equals(p2));: Point 클래스에 명시적으로 equals() 메서드가 정의되어 있지 않기 때문에 Object 클래스에서 상속받은 equals() 메서드가 호출됩니다. 
		// 이 메서드는 참조값을 비교하므로 false가 출력됩니다.
		System.out.println(p4.equals(p1));
	}
	// 결론적으로 == 연산자와 equals() 메서드는 객체의 동일성을 비교하는데 사용됩니다. 
	// == 연산자는 참조값을 비교하고, equals() 메서드는 객체의 내용을 비교합니다.
	// 객체의 내용을 비교하려면 equals() 메서드를 적절히 오버라이드해야 합니다.








}


