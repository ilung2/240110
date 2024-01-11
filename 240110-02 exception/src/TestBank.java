class Bank {
	private int balance;

	public Bank(int balance) {
		super();
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			throw new RuntimeException( // 예외를 볼때 이름이랑 메세지 부터 봐야함.
					"현재 잔고는 : " + balance
					+ ", 금액이 " + (amount - balance) + "만큼 부족합니다."
					);
		}
	}
}

public class TestBank {
	public static void main(String[] args) {
		Bank b = new Bank(10000);
		
		b.deposit(5000);
		System.out.println("입금이 완료되었습니다.");
		try {
			b.withdraw(30000);
			System.out.println("출금이 완료되었습니다.");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("현재 잔고는 : " + b.getBalance());
	}
}
