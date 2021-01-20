package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//실수값 저장
		//float var1 = 3.14; //실수를 기본적으로 double에 저장하므로 float쓰면 오류
		float var2 = 3.14f; //float 쓰려면뒤에 f 붙여야 한다.
		double var3 = 3.14;
		
		//정밀도 테스트
		float var4 = 0.12345678901234567890f; //0.12345679(19자리 중 8자리만 표시)
		double var5 = 0.12345678901234567890f; //19자리 중 17자리 표시 -> float보다 2배 정밀도
		
	
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
				
		//e사용하기 (e는 정수int 아니라 실수double!!)
		double var6 = 3e6;
		float var7 = 3e5f;
		double var8 = 2e-3;
		
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		

	}

}
