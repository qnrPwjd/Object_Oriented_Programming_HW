package HW2;

import java.util.Scanner;

public class BankAccount {
	private String accountNum;
	private String accountOwner;
	private int money;
	
	Scanner scan = new Scanner(System.in);
	
	BankAccount createAccount() {
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		
		System.out.print("계좌번호 : ");
		accountNum = scan.nextLine();
		
		System.out.print("계좌주 : ");
		accountOwner = scan.nextLine();
		
		System.out.print("초기입금액 : ");
		money = Integer.parseInt(scan.nextLine());
		
		System.out.println("결과: 계좌가 생성되었습니다.");
		
		BankAccount newAccount = new BankAccount(accountNum, accountOwner, money);
		return newAccount;
	}
	
	void printAccount() {
		System.out.println(this.accountNum + "\t" + this.accountOwner + "\t" + this.money);
	}
	
	boolean isThatAccount(String accountNum) {
		return this.accountNum.equals(accountNum);
	}
	
	void deposit(int depositMoney) {
		this.money += depositMoney;
	}
	
	void withdraw(int withdrawMoney) {
		if (this.money - withdrawMoney < 0) {
			System.out.println("결과 : 잔액이 부족해 출금에 실패햐였습니다.");
		} else {
			this.money -= withdrawMoney;
			System.out.println("결과 : 출금에 성공하였습니다.");
		}
	}
	
	public BankAccount(String accountNum, String accountOwner, int money) {
		this.accountNum = accountNum;
		this.accountOwner = accountOwner;
		this.money = money;
	}
	
	public BankAccount() {
		
	}
}