package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		// 정수 리터럴 덧셈
		byte res1 = 10 + 20;
		System.out.println(res1); // 피연산자가 변수가 아니므로 int타임으로 변환x(컴파일러에서 처리)
		
		//피연산자가 변수인 덧셈
		byte x = 1;
		byte y = 2;
		int res2 = x + y;
		//byte res2 = x + y; 컴파일 오류 발생! 
		//피연산자가 변수인 산술연산식은 JVM에서 x,y변수가 int아래의 타입이면 int로 변환시켜 계산함.
		System.out.println(res2);

	}

}
