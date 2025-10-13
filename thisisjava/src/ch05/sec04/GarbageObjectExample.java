package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null; // "여행"에 해당하는 객체는 이제 쓰레기가 됨
		
		String kind1 = "자동차";
		String kind2 = kind1; // kind1에 저장되어 있는 번지를 kind2 변수에 대입
		kind1 = null;
		System.out.println("kind2 : " + kind2);
	}

}
