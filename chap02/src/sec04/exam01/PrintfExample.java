package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		// printf 문자열 포맷팅 -> "% 값의순번 flag(정렬 -,0) 전체값길이(공백.점포함) .소수점아래길이 변환문자타입(d,s,f)"
		int value = 123;
		System.out.printf("상품의 가격: %3d원\n", value); //123원
		System.out.printf("상품의 가격: %6d원\n", value); //    123원
		System.out.printf("상품의 가격: %-6d원\n", value); //123   원
		System.out.printf("상품의 가격: %06d원\n", value); //000123원 
		//+ 오른쪽 정렬 000만 가능한 이유: 123000이 되면 아예 다른 수가 되어버리기 때문에.
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %1$d인 원의 넓이: %2$10.2f\n", 10, area);
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area);
		// 순번을 적지 않으면 args를 콤마로 나열한 순서대로 대입된다.
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s", 1, name, job); 
		//1을 float가 아니라 double로! 자바의 실수 기본타입은 double이기 때문에.
		
	}

}
