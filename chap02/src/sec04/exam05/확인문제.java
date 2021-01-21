package sec04.exam05;

import java.util.Scanner;

public class 확인문제 {

	public static void main(String[] args) throws Exception{
		// 1번 
		// 이름: 감자바 \n 나이: 25 \n 전화: 010-123-4567 출력하기
		String name = "감자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		
		System.out.println("이름: " + name);
		System.out.print("나이: " + age + "\n");
		System.out.printf("전화: %s-%s-%s\n", tel1, tel2, tel3);
		
		
		//2번
		//Scanner 이용하여 키보드로 입력한 두 수를 덧셈하여 결과를 출력.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 수");
		String first = scanner.nextLine();
		
		System.out.println("두 번쨰 수");
		String second = scanner.nextLine();
		
		int first_n = Integer.parseInt(first);
		int second_n = Integer.parseInt(second);
		int result = first_n + second_n;
		System.out.println("결과: " + result);
		
		
		//3번
		// 이름, 주민번호 앞 6자리, 전화번호 입력받고 출력하기
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		
		System.out.println("1. 이름:");
		String user_name = scan.nextLine();
		
		System.out.println("2. 주민번호 앞 6자리:");
		String user_id = scan.nextLine();
		
		System.out.println("3. 전화번호:");
		String user_phone = scan.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.printf(" 1. 이름: %s\n 2.주민번호 앞자리: %s\n 3. 전화번호: %s", user_name, user_id, user_phone);
		

	}

}
