package sec04.exam02;

public class KeyCodeEXAMPLE {

	public static void main(String[] args) throws Exception{
		//입력받을 때 오류가 나는 것을 방지 -> 예외처리(throws Exception)
		
		int keyCode;
		
		keyCode = System.in.read(); //예외일 때 콘솔에 출려굄.
		System.out.println("keyCode: " + keyCode); 

		keyCode = System.in.read(); //예외일 때 콘솔에 출려굄.
		System.out.println("keyCode: " + keyCode); 

		keyCode = System.in.read(); //예외일 때 콘솔에 출려굄.
		System.out.println("keyCode: " + keyCode); 
		keyCode = System.in.read(); //예외일 때 콘솔에 출려굄.
		System.out.println("keyCode: " + keyCode); 
		keyCode = System.in.read(); //예외일 때 콘솔에 출려굄.
		System.out.println("keyCode: " + keyCode); 

		//a + enter -> 93, 13, 10
		// 바 + enter -> 235, 175, 148, 13, 10
	}

}
