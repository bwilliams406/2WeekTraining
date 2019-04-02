package dayOne.BankAccount;

import java.util.HashMap;

public class Main {
    static HashMap<Integer, BankAccount > BankAccounts = new HashMap<>();
    public static void main(String[] args) {

        BankAccount brodysAccount = new BankAccount ();
        brodysAccount.setId(123);
        brodysAccount.setAccount_holder("Brody");
        brodysAccount.setBalance(3000.00);

        BankAccount alexsAccount = new BankAccount ();
        alexsAccount.setId(124);
        alexsAccount.setAccount_holder("Alex");
        alexsAccount.setBalance(4000.00);

        BankAccount marksAccount = new BankAccount ();
        marksAccount.setId(125);
        marksAccount.setAccount_holder("Mark");
        marksAccount.setBalance(5000.00);

        BankAccounts.put(brodysAccount.getId(), brodysAccount);
        BankAccounts.put(alexsAccount.getId(), alexsAccount);
        BankAccounts.put(marksAccount.getId(), marksAccount);

        depositTenToAccount(123);
        System.out.println("Alex's new balance " + alexsAccount.getBalance());

    }

    public static Double depositTenToAccount(int accountId) {
        return BankAccounts.get(accountId).plusTen();
    }
}
