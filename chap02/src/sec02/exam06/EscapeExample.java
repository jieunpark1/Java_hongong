package sec02.exam06;

public class EscapeExample {

	public static void main(String[] args) {
		String line1 = "번호\t이름\t직업";
		String line2 = "행 단위 출력\n행 단위 출력\n";
		String line3 = "우리는 \"개발자\" 입니다.";
		String line4 = "봄\\여름\\가을\\겨울";
		
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
		System.out.println(line4);
		System.out.print("행 단위 출력"); //print하면 개행이 안됨.
		System.out.print("행 단위 출력"); //println = print + ln
		System.out.println("\n  행 단위 출력\n행 단위 출력");
		
		
	}

}
