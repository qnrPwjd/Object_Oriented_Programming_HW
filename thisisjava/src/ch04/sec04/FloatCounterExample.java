package ch04.sec04;

public class FloatCounterExample {

	public static void main(String[] args) {
		// 반복문을 float type 으로 잘 쓰지 않는 이유
		for(float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
	}
}