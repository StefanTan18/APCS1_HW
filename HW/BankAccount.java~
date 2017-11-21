// Team Ice Cream
// APCS1 pd8
// HW10 -- Mo Money Mo Problems
// 2017-10-03

public class BankAccount
{
	//instance variables
	private String name;
	private String passwd;
	private int pin;
	private int acctNum;
  	private double balance;


  	//mutators
  	public String setName( String newName )
  	{
  		String oldName = name;
  		name = newName;
  		return oldName;
  	}

  	public String setPasswd( String newPasswd )
  	{
  		String oldPasswd = passwd;
  		passwd = newPasswd;
  		return oldPasswd;
  	}

  	public int setPin( int newPin ) {
  		int oldPin = pin;
  		if (newPin >= 1000 && newPin <= 9998) {
	  		pin = newPin;
	  		return oldPin;
  		}
  		else {
  			System.out.println("The new account number is not within the range of 1000 to 9998.");
  			pin = 9999;
  			return oldPin;
  		}
  	}

  	public int setAcctNum( int newAcctNum )  {
  		int oldAcctNum = acctNum;
  		if (newAcctNum >= 100000000 && newAcctNum <= 999999998) {
	  		acctNum = newAcctNum;
	  		return oldAcctNum;
  		}
  		else {
  			System.out.println("The new account number is not within the range of 100000000 to 999999998.");
  			acctNum = 999999999;
  			return oldAcctNum;
  		}
  	}

  	public double setBalance( double newBalance )
  	{
  		double oldBalance = balance;
  		balance = newBalance;
  		return oldBalance;
  	}

  	public void deposit( double depositAmount ) {
  		balance = balance + depositAmount;
  	}

  	public boolean withdraw(double withdrawAmount) {
  		if (withdrawAmount > balance) {
  			System.out.println("This account does not have enough money.");
  			return false;
  		}
  		else {
  			balance -= withdrawAmount;
  			return true;
  		}
  	}
  	
  	public boolean authenticate(int inputAcctNum, String inputPassword) {
  		if (inputAcctNum == acctNum && inputPassword == passwd) {
  			return true;
  		}
  		else {
  			return false;
  		}
  	}
  	
  	//overwritten toString()
  	public String toString() {
  		String retStr = "\nAccount info:\n=======================";
  		retStr = retStr + "\nName: " + name;
  		retStr = retStr + "\nPassword: " + passwd;
  		retStr = retStr + "\nPIN: " + pin;
    	retStr = retStr + "\nAccount Number: " + acctNum;
    	retStr = retStr + "\nBalance: " + balance;
    	retStr = retStr + "\n=======================";
    	return retStr;
  	}
  	

  //main method for testing
  	public static void main( String[] args )
  	{
    // INSERT YOUR METHOD CALLS FOR TESTING HERE
  		BankAccount acc = new BankAccount();
  		System.out.println(acc);
  		acc.setAcctNum(293149102);
  		acc.setPin(1234);
  		acc.setPasswd("thisisapassword");
  		acc.deposit(10000);
  		acc.setName("Bob");
  		System.out.println(acc);
  		acc.setAcctNum(1);
  		acc.withdraw(10);
  		System.out.println(acc);
  		acc.withdraw(1000000);
  		System.out.println(acc.authenticate(999999999,"thisisapassword"));
  		System.out.println(acc.authenticate(999999999,"thisisapasswor"));
  }//end main()

}//end class BankAccount
