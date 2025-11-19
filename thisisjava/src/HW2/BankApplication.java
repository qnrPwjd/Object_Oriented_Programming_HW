package HW2;

import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		int input;
		Scanner scan = new Scanner(System.in);
		BankAccount[] accounts = new BankAccount[100];
		int index = 0;
		
		while (true) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택>");
			input = Integer.parseInt(scan.nextLine());
			
			if (input == 1) {
				BankAccount newAccount = new BankAccount();
				accounts[index++] = newAccount.createAccount();
			} else if (input == 2) {
				System.out.println("----------");
				System.out.println("계좌목록");
				System.out.println("----------");
				for(int i = 0; i < index; i++) {
					accounts[i].printAccount();
				}
			} else if (input == 3) {
				System.out.println("----------");
				System.out.println("예금");
				System.out.println("----------");
				System.out.print("계좌번호: ");
				String accountCase = scan.nextLine();
				for(int i = 0; i < index; i++) {
					if(accounts[i].isThatAccount(accountCase)) {
						System.out.print("예금액 : ");
						int depositMoney = Integer.parseInt(scan.nextLine());
						accounts[i].deposit(depositMoney);
						break;
					}
				}
			} else if (input == 4) {
				System.out.println("----------");
				System.out.println("출금");
				System.out.println("----------");
				System.out.print("계좌번호: ");
				String accountCase = scan.nextLine();
				for(int i = 0; i < index; i++) {
					if(accounts[i].isThatAccount(accountCase)) {
						System.out.println("출금액 : ");
						int withdrawMoney = Integer.parseInt(scan.nextLine());
						accounts[i].withdraw(withdrawMoney);
						break;
					}
				}
			} else if (input == 5) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못된 입력입니다!!!");
			}
			
		}
		scan.close();
	}
}