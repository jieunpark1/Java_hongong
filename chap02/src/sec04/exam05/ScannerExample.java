package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		// 키보드에 입력된 모든 내용을 문자열로 얻고 읽기
		// 여러 문자를 가진 문자열(string)을 읽을 때는 scanner를 사용한다.
		//(System.in.read()의 경우에는 문자열을 통으로 가져오지 못하기 때문)
		
		Scanner scan = new Scanner(System.in); 
			//Scanner타입의 변수 scan를 선언한다. 
			//new Scanner(System.in)은 시스템 입력장치로부터 읽는 Scanner를 생성하는 코드이다.
			//scan이 하나의 객체가 되고(new가 객체 생성 연산자), 
			//scan.nextLine() 객체.메소드를 실행하면 문자열 읽기가 가능하다.
		
		String userInput;
		
		while(true) {
			
			userInput = scan.nextLine();
			
			if(userInput.equals("q")) {
				System.out.println("종료합니다");
				break;
			}
			else{
				System.out.println("입력된 문자열: \"" + userInput + "\"");
			}
			
		}
		
		

	}

}
