package sec01.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x : " + x + ", y: " + y);
		
		//x변수에 할당된 값을 y변수에 할당하기
		y = x;
		System.out.println("x : " + x + ", y: " + y);
		
		//값 초기화
		x = 3;
		y = 5;
		
		//교환하기 x <-> y
		int temp = x;
		temp = x;
		x = y;
		y = temp;
		System.out.println("x : " + x + ", y: " + y);

	}

}
