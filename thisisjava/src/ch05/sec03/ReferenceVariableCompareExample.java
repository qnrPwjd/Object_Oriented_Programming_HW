package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		int[] arr1; // 배열 변수 arr1선언
		int[] arr2; // 배열 변수 arr2선언
		int[] arr3; // 배열 변수 arr3선언
		
		arr1 = new int[] {1, 2, 3}; // 배열 {1, 2, 3} 생성 후  arr1 에 대입
		arr2 = new int[] {1, 2, 3}; // 배열 {1, 2, 3} 생성 후  arr2 에 대입
		arr3 = arr2; // arr2의 내용물을 arr3에 대입
		
		System.out.println(arr1 == arr2); // arr1과 arr2가 같은지 확인
		System.out.println(arr2 == arr3); // arr2과 arr3가 같은지 확인
	}

}
