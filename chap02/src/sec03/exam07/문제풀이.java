package sec03.exam07;

public class 문제풀이 {

	public static void main(String[] args) {
		
		//<2번>
		//작은 타입에서 큰 타입으로도 강제 타입 변환이 가능하다.
		int intValue = 10;
		double var = (double) intValue;
		System.out.println(var);
		
		int intvar = (int) var;
		System.out.println(intvar);
		
		//문자열(String)은 char로 강제 타입 변환이 불가하다.
		String str_short = "A";
		//char charval = (char) strVal;
		//System.out.println(charval);
		
		//강제 타입 변환 대신 메소드 사용하여 String을 char로 바꾼다.
		char charval = str_short.charAt(0);
		System.out.println(charval);
		
		String str_long = "문자열";
		char[] charVal = str_long.toCharArray();
		System.out.println(charVal);
		
		//<5번>
		char c1 = 'a';
		//char c2 = c1 + 1; char c1은 int보다 작은 피연산자이므로 int로 변환됨.
		int c2 = c1 + 1;
		System.out.println((char) c2);
		
		/* or
		char c2 = (char) (c1 + 1);
		System.out.println(c2);
		 */
		
		//<8번> 두 실수를 더하고 소수점 이하 자리를 버리고 싶다. 즉슨, double -> int 강제타입변환 하라.
		double var1 = 3.5;
		double var2 = 2.7;
		int result = (int) (var1 + var2);
		System.out.println(result);
		
		/*오답
		int result = Int.parseInt(var1 + var2);
		System.out.println(result);
		*/
		
		//<9번> 4개의 피연산자를 가지고 result에 변수 9가 저장되도록 하라.
		long v1 = 2L;
		float v2 = 1.8f;
		double v3 = 2.5;
		String v4 = "3.9";
		
		int res = (int) ((v1 + v2) + v3 + (int) Double.parseDouble(v4));
		System.out.println(res);
		
		/* 다른 정답
		 * (int) var1 + (int)(var2 + var3) + (int) Double.parseDouble(var4); //각 항마다 다 강제타입변환
		 * (int) (var1 + (int) var2 + var3 + Double.parseDouble(var4)); // var2만 강제타입변환
		 * (int)(var1 + var2+ (int)var3 + Double.parseDouble(var4)); //var3만 강제타입변환
		 * (int)(var1 + var2 + var3 + (int)Double.parseDouble(var4)); //var4만 강제타입변환
		 * 
		 * 피연산자 덧셈할 때는 타입 크기가 큰 쪽으로 자동 타입변환된다.
		 * 큰 타입에서 작은 타입으로 바꿀 때는 강제타입변환이 필요하다.
		 * string "3.9"같은 실수는 double로 parseDouble 한 후, int로 변환하는 게 낫다.
		 * */
		
		/*오답
		 * int result = (int) v1 + (int) v2 + v3 + Double.parseDouble(v4);
		 * System.out.println(result);
		 */
		

	}

}
