package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; // x = 11
		++x; // x = 12
		System.out.println("x = " + x); // x = 12 출력
		
		System.out.println("--------------------------------");
		y--; // y = 9
		--y; // y = 8
		System.out.println("y = " + y); // y = 8 출력
		
		System.out.println("--------------------------------");
		z = x++; // z = 12 대입 후 x = 13으로 변경
		System.out.println("z = " + z); // z = 12 출력
		System.out.println("x = " + x); // x = 13 출력
		
		System.out.println("--------------------------------");
		z = ++x; // x = 14로 변경 후 z = 14 대입
		System.out.println("z = " + z); // z = 14 출력
		System.out.println("x = " + x); // x = 14 출력
		
		System.out.println("--------------------------------");
		z = ++x + y++; // x = 15 로 변경 후 z = x + y = 15 + 8 = 23 대입 이후 y = 9로 변경
		System.out.println("z = " + z); // z = 23 출력
		System.out.println("x = " + x); // x = 15 출력
		System.out.println("y = " + y); // y = 9 출력
	}

}
