abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(int accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    public abstract double calculateInterest();
    public void display(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Holder Name: "+holderName);
        System.out.println("Balance: "+balance);
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount Deposited, Balance: "+balance);
        }
        else System.out.println("Invalid Amount");
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdraw Successful, Balance: "+balance);
        }
    }
    public String getAccountNumber(){
        return "Account Number is not Accessible";
    }
    public String getName(){
        return holderName;
    }
    public double getBalance(){
        return balance;
    }
}
interface Loanable{
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}
class SavingsAccount extends BankAccount implements Loanable{
    private final double interestRate = 0.02; 
    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Applied for $"+amount+" loan");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance()*2;
    }

    @Override
    public double calculateInterest() {
        return getBalance()*interestRate;
    }
    
}
class CurrentAccount extends BankAccount implements Loanable{
    private final double interestRate=0.02;
    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Applied for $"+amount+" loan");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance()*2;
    }

    @Override
    public double calculateInterest() {
        return getBalance()*interestRate;
    }
    
}
public class Program4 {
    public static void main(String[] args) {
        BankAccount[] accounts={
            new SavingsAccount(12345678, "Rakesh", 5000),
            new CurrentAccount(87665432, "Monesh", 6500)
        };
        for(BankAccount acnt:accounts){
            acnt.display();
            double interest=acnt.calculateInterest();
            System.out.println("Calculated Interest: "+interest);
            if(acnt instanceof Loanable){
                Loanable loanAcc= (Loanable) acnt;
                loanAcc.applyForLoan(9000);
                System.out.println("Loan Elibility: "+loanAcc.calculateLoanEligibility());
            }
        }
        
    }
}
