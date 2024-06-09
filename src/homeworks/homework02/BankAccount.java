package homeworks.homework02;

public class BankAccount {

    private User owner;
    private double balance;

    public BankAccount(User owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public BankAccount(User owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if (amount<=0)
        {
            System.out.println("You can not add negative amount");
            return;
        }
        this.balance+=amount;
    }

    public void withdraw(double amount){
        if (amount < 0)
        {
            System.out.println("You can not withdraw negative amount");
        }

        if (this.balance - amount < 0)
        {
            System.out.println("Amount is not enough");
            return;
        }

        this.balance-=amount;
    }
    public String getOwner(){
        return owner.getFullName();
    }
    public void printData()
    {
        System.out.printf("Owner Name: %s\nBalance: %.2f\n\n",this.getOwner(),this.balance);
    }

    public void addInterest(double rate){
        this.balance += this.balance * rate;
    }

}
