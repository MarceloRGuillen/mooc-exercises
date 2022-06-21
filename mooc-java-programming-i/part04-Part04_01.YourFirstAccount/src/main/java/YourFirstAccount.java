
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account money = new Account("Marcelo", 100.00);
        money.deposit(20.00);
        System.out.println(money.toString());
    }
}
