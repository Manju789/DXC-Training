package Demo;

public class AccountTest1 {
	public static void main(String[] args) {
		Account acct=new Account(3245,(double) 3400,true);
		acct.depositAmount(2000);
		acct.withdrawAmount(1700);
		System.out.println(acct.getAccNo());
		System.out.println(acct.getBalance());
		
	}
}
