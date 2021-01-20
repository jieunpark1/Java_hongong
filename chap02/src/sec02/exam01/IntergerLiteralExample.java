package sec02.exam01;

public class IntergerLiteralExample {

	public static void main(String[] args) {
		int var1 = 0b1011; //2진수(0b로 시작)
		int var2 = 0206; //8진수(0으로 시작)
		int var3 = 365;
		int var4 = 0xB3;// 16진수(0x로 시작)
		
		System.out.println("var1(2진수 0b): "+ var1);
		System.out.println("var2(8진수 0): "+ var2);
		System.out.println("var3(10진수): "+ var3);
		System.out.println("var4(16진수 0x): "+ var4);
		
		int var5 = 0b1010;
		int var6 = 0b0101;
		System.out.println(var5 + " + " + var6 + " = " + (var5 + var6));
		
		int var7 = 0xF9;
		System.out.println(var7);

	}

}
