package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		//int 4 -> char 2
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		
		//long 8 -> int 4
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		
		// double 실수 -> int 정수
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);

	}

}
