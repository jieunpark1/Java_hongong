package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
			
		}
		int v3 = v1 + 5 + 2; //v2 변수를 사용할 수 없기 떄문에 컴파일 에러가 발생한다.
		System.out.println(v3);
	}

}
