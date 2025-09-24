package test;

public class test {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y; // int type의 사용 범위를 넘어서 overflow 발생
		
		System.out.println(z);
		
		System.out.println("--------------------------");
		
		long x1 = 1000000;
		long y1 = 1000000;
		long z1 = (long)x * (long)y; // long type의 허용 범위는 넘지 않아 overflow가 발생하지 않는다.
		
		System.out.println(z1);
	}

}
