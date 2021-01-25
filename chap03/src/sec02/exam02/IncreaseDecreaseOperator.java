package sec02.exam02;

public class IncreaseDecreaseOperator {

	public static void main(String[] args) {
		// 
		int x = 10;
		int y = 10;
		int z;

		System.out.println("--------------");
		x++;
		++x;
		System.out.println("x=" + x);
		
		
		System.out.println("--------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		
		System.out.println("--------------");
		z = x++;
		System.out.println("z: " + z);
		System.out.println("x: " + x);
		
		System.out.println("--------------");
		z = ++x;
		
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		System.out.println("--------------");
		z = ++x + y++; //x(14)에 +1(++x) ->15 -> 15 + y(8) = result 23, y=9(y++)
		
		System.out.println("z: " + z);
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		

	}

}
