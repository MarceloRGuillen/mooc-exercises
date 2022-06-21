
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account checking = new Account("Matthews account", 1000);
        Account checking2 = new Account("My account", 0);
        checking.withdrawal(100.0);
        checking2.deposit(100.0);
        System.out.println(checking.toString());
        System.out.println(checking2.toString());
    }
}
