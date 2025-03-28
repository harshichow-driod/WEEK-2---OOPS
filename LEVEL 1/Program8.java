class BankAccount{
    protected String accountNumber;
    protected double balance;
    public BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void displayAccountType(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}
class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(String accountNumber,double balance,double interestRate){
        super(accountNumber, balance);
        this.interestRate=interestRate;
    }
    public void displayAccountType(){
        System.out.println("Account Type: Savings Account");
        super.displayAccountType();
        System.out.println("Interest Rate: "+interestRate+"%");
    }

}
class CheckingAccount extends BankAccount{
    private double withrawalLimit;
    public CheckingAccount(String accountNumber,double balance,double withdrawalRate){
        super(accountNumber, balance);
        this.withrawalLimit=withdrawalRate;
    }
    public void displayAccountType(){
        System.out.println("Account Type: Checking Account");
        super.displayAccountType();
        System.out.println("Withdrawal Limit: "+withrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount{
    private int maturityPeriod;
    public FixedDepositAccount(String accountNumber, double balance,int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod=maturityPeriod;
    }
   
    public void displayAccountType(){
        System.out.println("Account Type: Fixed Deposit Account");
        super.displayAccountType();
        System.out.println("Maturity Period: "+maturityPeriod+" months");
    }

}
public class Program8 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 5000.0, 4.5);
        CheckingAccount checking = new CheckingAccount("CA456", 3000.0, 1000.0);
        FixedDepositAccount fixed = new FixedDepositAccount("FD789", 10000.0, 12);
        savings.displayAccountType();
        System.out.println("--------------------------------------");
        checking.displayAccountType();
        System.out.println("--------------------------------------");
        fixed.displayAccountType();
    }
   
}