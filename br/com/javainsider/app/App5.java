package br.com.javainsider.app;

import br.com.javainsider.account.EncapsulatedAccount;

public class App5 {

    public static void main(String[] args) {

        var a = new EncapsulatedAccount("123", "Pedro");
        a.deposit(1000);
        a.withdraw(200);

        a.printBalance();

        System.out.println(a.getAccountNumber());
        System.out.println(a.getAccountOwner());
    }
}
