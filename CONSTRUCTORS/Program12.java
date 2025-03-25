class BankAccount{
    public int accountNumber;
    protected String accountHolder;
    private Double balance;

    BankAccount(int accountNumber,String accountHolder,double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public void withdraw(int amount){
        if(balance>0 && balance>=amount){
            balance-=amount;
            System.out.println("Withdraw successful");
        }
        else System.out.println("Invlaid amount or Insufficient balance");
    }
    public void deposit(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit Successful");
        }
        else System.out.println("Invalid amount");
    }
    public void display(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Balance: "+balance);
    }
}
class SavingsAccount extends BankAccount{
    private double interestRate;
    SavingsAccount(int accountNumber,String accountHolder,double balance,double interestRate){
        super(accountNumber, accountHolder, balance);
        this.interestRate=interestRate;
    }
    public void displaySavingsAccount(){
        display();
        System.out.println("Interest Rate: "+interestRate+"%");
    }
}
public class Program12 {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount(73054, "Rakesh", 1200000);
        System.out.println("Account Details:");
        account1.display();
        account1.deposit(5000);
        account1.withdraw(2500);
        account1.display();
        SavingsAccount s1=new SavingsAccount(12245, "Monesh", 345000, 2.5);
        s1.displaySavingsAccount();
    }
    
}
