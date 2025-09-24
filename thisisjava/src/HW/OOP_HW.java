package HW;

import java.util.Scanner;

public class OOP_HW {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long money = 10000;
		long input;
		
		while(true) {
			System.out.println("----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.println("선택> ");
			
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				System.out.println("예금액>");
				String strX = scanner.nextLine();
				input = Integer.parseInt(strX);
				money += input;
				System.out.println("현재돈은: " + money);
			} else if (strNum.equals("2")){
				System.out.println("출금액>");
				String strX = scanner.nextLine();
				input = Integer.parseInt(strX);
				if (input > money) {
					System.out.println("사기 ㄴㄴ");
				} else {
					money -= input;
					System.out.println("현재돈은: " + money);					
				}
			} else if (strNum.equals("3")) {
				System.out.println("현재돈은: " + money);
			} else if (strNum.equals("4")) {
				System.out.println("감사합니다.");
				break;
			} else {
				System.out.println("잘못된 입력입니다!");
			}
		}
		
		scanner.close();

	}

}
