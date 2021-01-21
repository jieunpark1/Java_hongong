package sec04.exam03;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception{
		//keyCode가 true일 때 계속 입력 받음.
		//입력값에 대한 모든 키코드를 받아올 수 있다.
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
		}
		//ex) 미 -> 235, 175, 184, 13, 10
		//ex) Apple -> 65, 112, 112, 108, 101, 13, 10

	}

}
