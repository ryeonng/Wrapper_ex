package ch01;

public class MainTest1 {

	public static void main(String[] args) {

		int num1 = 3; // -> Integer
		Integer num2 = new Integer(3); // 박싱(감싸서 넣는다.)
		// Integer -> @Deprecated : 더 이상 유지보수 하지 않는다.
		int num3 = num2.intValue(); // integer 데이터 타입을 풀어냄 = 언박싱
	
		System.out.println(num2);
		System.out.println(num3);
		
		// 2단계 - 자동 박싱, 자동 언박싱 용어의 이해
		
		Integer num4 = 17; // 자동 박싱 (integer에 int 타입이 들어 감) // int <-- Wrapper --> Integer 로 변환 된 것 !
		int num5 = num4; // 자동 언박싱 (integer타입인 num4가 int 데이터 타입에 들어 가도록 자동 형 변환 시킴) 
		
	} // end of main

} // end of class
