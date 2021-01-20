package sec03.exam05;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		// 피연산자 byte + byte = int
		byte byteVal1 = 10;
		byte byteVal2 = 20;
		//byte res1 = byteVal1 + byteVal2; int보다 작은 피연산자 변수는 모두 int로 바뀜
		int res1 = byteVal1 + byteVal2;
		System.out.println(res1);
		
		// 피연산자 char + char = int
		char charVal1 = 'A';
		char charVal2 = 1;
		//char res2 = charVal1 + charVal2
		int intVal = charVal1 + charVal2;
		System.out.println("유니코드: " + intVal);
		System.out.println("출력문자: " + (char) intVal); //int 4-> char2 (강제 타입 변환)
		
		//정수 / 정수 = 정수 
		int intVal3 = 10;
		int intVal4 = intVal3 / 4; // 정수 / 정수
		System.out.println(intVal4); // 정수 2
		
		//실수 / 정수 = 실수
		int intVal5 = 10;
		//int intVal6 = 10 / 4.0; 실수 / 정수는 int가 아니라 double로 타입표기 해야한다.
		double doubleVal = intVal5 / 4.0;
		System.out.println(doubleVal);
		
		//'정수 / 정수 = 실수' 로 나오게 하는 방법 3가지
		int x = 1;
		int y = 2;
		double result1 = (double) x / y;
		double result2 = (double) x / (double) y;
		double result3 = x / (double) y;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3); //#2.5
				

		//번외 0으로 나오게 하기
		int res_int = x / y;
		System.out.println(res_int); //#0
		
		double res_double = x/y;
		System.out.println(res_double);//0.0
	} 

}
