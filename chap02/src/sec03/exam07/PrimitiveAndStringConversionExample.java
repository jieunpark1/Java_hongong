package sec03.exam07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		// String과 기본타입 사이의 변환
		// String -> int , double, boolean 타입으로 변환
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1 );
		System.out.println("value2: " + value2 );
		System.out.println("value3: " + value3 );
		
		
		//기본타입 -> String(String.valueOf(기본타입))
		String v1 = String.valueOf(10);
		String v2 = String.valueOf(3.14);
		String v3 = String.valueOf(true);
		
		System.out.println("Str1: " + v1);
		System.out.println("Str2: " + v2);
		System.out.println("Str3: " + v3);
		

	}

}
