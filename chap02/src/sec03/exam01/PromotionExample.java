package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		// 자동 타입 변환
		//byte 1-> int 4 
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		//char 2 -> int 4 (byte -> char 음수 때문에 안됨)
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		//int 4-> long 8
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		//long 8 (정수)-> float (실수)
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		//float -> double
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
		
	}

}
