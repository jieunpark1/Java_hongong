package sec02.exam01;

public class SignOperatorExample {

	public static void main(String[] args) {
		// 부호 연산자 (char-음수없음, boolean 제외한 모든 기본타입에 적용 가능)
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println(result1);
		System.out.println(result2);
		
		//int 이하 변수의 (byte) 부호 연산
		byte y = 100;
		//byte result3 = -y; //int이하의 정수는 부호 연산할 때 int로 변환되므로 컴파일 에러 발생
		int result3 = -y;
		System.out.println(result3);
		

	}

}
