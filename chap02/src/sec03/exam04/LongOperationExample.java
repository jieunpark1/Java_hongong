package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		//byte + int + long
		byte val1 = 10;
		int val2 = 20;
		long val3 = 1000L; //int아니라 long 타입임을 알려주는 표시
		
		int res1 = val1 + val2;
		long res2 = res1 + val3; //14line을 수행하는 과정
		
		long result_final = val1 + val2 + val3;
		System.out.println(result_final);
		

	}

}
