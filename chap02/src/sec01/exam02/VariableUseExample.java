package sec01.exam02;

public class VariableUseExample {

	public static void main(String[] args) {
		int hour = 3;
		int min = 5;
		System.out.println(hour+"시간 "+min+"분");
		
		int totalMinute = (hour*60) + min;
		System.out.println("총 " + totalMinute + " 분");
		

	}

}
