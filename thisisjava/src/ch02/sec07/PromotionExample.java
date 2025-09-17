package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		byte bytevalue = 10;
		int intvalue = bytevalue;
		System.out.println("intvalue: " + intvalue);
		
		char charvalue = '가';
		intvalue = charvalue;
		System.out.println("가의 유니코드: " + intvalue);
		
		intvalue = 50;
		long longvalue = intvalue;
		System.out.println("longvalue: " + longvalue);
		
		longvalue = 100;
		float floatvalue = longvalue;
		System.out.println("floatvalue: " + floatvalue);
		
		floatvalue = 100.5F;
		double doublevalue = floatvalue;
		System.out.println("doublevalue: " + doublevalue);
	}

}
