class BankAccount{
    public static String bankName="SBI";
    private static int totalAccounts=0;
    public String accountHolderName;
    private final int accountNumber;
   
    BankAccount(String accountHolderName,int accountNumber){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        totalAccounts++;
    }
    public static void getTotalAccounts(){
        System.out.println("Total Accounts: "+totalAccounts);
    }
    public void display(){
        System.out.println("Bank Name: "+bankName);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
    }
}
public class Program1{
    public static void main(String[] args) {
        BankAccount account=new BankAccount("Rakesh", 73054);
        if(account instanceof BankAccount){
            account.display();
        }
        BankAccount.getTotalAccounts();
    }
}


 
