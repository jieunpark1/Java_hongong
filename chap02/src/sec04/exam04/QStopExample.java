package sec04.exam04;

public class QStopExample {

	public static void main(String[] args) throws Exception{
		// 사용자가 q를 누르면 키코드 while문을 빠져나오도록 하기
		// keyCode, while, if 사용
		
		int keyCode;
		
		while (true) {
			
			keyCode = System.in.read();
			
			if (keyCode == 113) {
				System.out.println("종료합니다.");
				break;
			}
			
			else {
				System.out.println("keyCode: " + keyCode);
			}
		}

	}

}
