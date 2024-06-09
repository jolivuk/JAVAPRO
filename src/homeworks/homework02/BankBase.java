package homeworks.homework02;

public class BankBase {
    public static void main(String[] args) {

        BankAccount firstAccount = new BankAccount(new User("Ivan","Ivanov", "Praga"), 15000);
        BankAccount secondAccount = new BankAccount(new User("Vera","Smirnova", "Munchen"));
        BankAccount thirdAccount = new BankAccount(new User("Vladimir","Petrov", "Berlin"), 189000);

        firstAccount.deposit(40000);
        firstAccount.printData();

        firstAccount.addInterest(0.05);
        firstAccount.printData();

        secondAccount.deposit(158000);
        secondAccount.printData();

        thirdAccount.withdraw(50648);
        thirdAccount.printData();

    }
}
