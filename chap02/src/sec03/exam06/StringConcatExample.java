package sec03.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		//숫자 연산
		int value = 10  + 2 + 8;
		System.out.println(value);
		
		//String + 기본타입 = String (앞에서부터 순차적으로 더해나감)
		String str1 = 10 + 2 + "8";
		System.out.println("str 1: " + str1); // 12 + "8" = "12" + "8" = "128"
		
		String str2 = 10 + "2" + 8;
		System.out.println("str 2: " + str2); // 10 + "2" = "10" + "2" = "102"
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3: " + str3); // "10" + 2 = "10" + "2" = "102"
											// "102" + 8 = "102" + "8" = "1028"
		
		String str4 = "10" + (2+8); // "10" + (10) = "10" + "10" = "1010"
		System.out.println("str4: " + str4);
		

	}

}
