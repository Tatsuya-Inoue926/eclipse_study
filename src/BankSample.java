
class BankSample {

	public static void main(String[] args) {
		//↓コンストラクタの呼び出し
		BankAccount account = new BankAccount(12345, "John Smith", 1000.0);
		account.deposit(500.0);
		account.withdraw(200.0);
		//ゲッターのreturnで変数balanceにプライベート変数のbalance値を代入
		double bc = account.getBalance();
		//ゲッターのreturnで変数accountNameにプライベート変数のaccountNameを代入
		String aN = account.getAccountName();
		System.out.println(aN + " Current balance: " + bc);

	}

}

class BankAccount {
    private int accountNumber;
    private String accountName;
    private double balance;
    
    //コンストラクタの設定
    public BankAccount(int accountNumber, String accountName, double balance) {
        //プライベート変数のaccountNumberに引数を代入している
    	this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    
    //コンストラクタで受け取った引数の中身（accountNumberに代入済）をmainの変数に代入する
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountName() {
        return accountName;
    }
    //引数で受け取った値をbalanceに代入し、その値をmainのgetBalance関数の値とする
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }
}

