class Account {
	int num;
	String name;
	int balance;
	String info() {
		return "번호 :" + num + ", 이름 : " + name + ", 잔액 :" + balance; 
	}
	void deposit(int money) {
		if(money > 0) {
			balance += money;
			
		}
		
		
	 
	}
	
	void withdraw(int money) {
		if(balance >= money) {
			balance -= money;
			
		}
		
		
	 
	}
	
}

public class ClassTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account();
		acc1.num = 1001;
		acc1.name = "홍길동";
		acc1.balance = 100000;
		
		System.out.println(
				"번호 :" + acc1.num 
				+ " 이름 :" + acc1.name 
				+ " 잔액 :" + acc1.balance 
				);
		
		
		Account acc2 = new Account();
		acc2.num = 1001;
		acc2.name = "고길동";
		acc2.balance= 200000;
		
		System.out.println(
				"번호 :" + acc2.num 
				+ " 이름 :" + acc2.name 
				+ " 잔액 :" + acc2.balance 
				);
		
		System.out.println(acc1.info());
		acc1.deposit(50000);
		System.out.println(acc1.info());
		acc1.withdraw(60000);
		System.out.println(acc1.info());
	}

}
