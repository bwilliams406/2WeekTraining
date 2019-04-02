package dayOne.BankAccount;


import java.util.HashMap;

public class BankAccount {
    int id;
    String account_holder;
    Double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount_holder() {
        return account_holder;
    }

    public void setAccount_holder(String account_holder) {
        this.account_holder = account_holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double plusTen(){
        return this.getBalance() + 10;
    }
}
