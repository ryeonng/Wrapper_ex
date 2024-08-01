package ch01;

public class MainTest2 {

	public static void main(String[] args) {

		String str1 = "10";
		String str2 = "20.5";
		String str3 = "true";
		
		System.out.println(str2 + 100); // 숫자를 문자형으로 인식
		
		// str1의 10 이라는 데이터타입을 숫자로 변경하고 싶다면?
		// 문자열의 데이터타입을 정수값으로 변경하는 방법
		// 예외처리 추가 (어떤 값이 들어올 지 모르기 때문 : str1에 문자타입이 포함되어 있다면? 10A)
		try {
			int n1 = Integer.parseInt(str1);
			System.out.println(n1);
			System.out.println(n1 + 100);
		} catch (Exception e) {
			System.out.println("잘못된 입력 값 입니다.");
		}
		
		// str2 --> double --> 8byte
		// str2의 문자를 double 타입으로 변경
		double d = Double.parseDouble(str2);
		System.out.println(d);
		
		// str3 --> Boolean --> 1byte
		// str3의 문자를 Boolean 타입으로 변경
		boolean b = Boolean.parseBoolean(str3);
		System.out.println(b);
		
		// 반대로, int값을 String 데이터 타입으로 변환 하고자 한다면
		int number = 10000;
		
		String numberStr = String.valueOf(number);
		System.out.println(numberStr);
		
	} // end of main

} // end of class
