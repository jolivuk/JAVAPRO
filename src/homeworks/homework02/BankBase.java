package homeworks.homework02;

public class BankBase {
    public static void main(String[] args) {

        BankAccount firstAccount = new BankAccount("Ivan Ivanov", 15000);
        BankAccount secondAccount = new BankAccount("Vera Ivanovna");
        BankAccount thirdAccount = new BankAccount("Vasilij Petrov", 189000);

        firstAccount.deposit(40000);
        firstAccount.printData();

        secondAccount.deposit(158000);
        secondAccount.printData();

        thirdAccount.withdraw(50648);
        thirdAccount.printData();
    }
}
