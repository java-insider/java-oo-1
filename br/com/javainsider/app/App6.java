package br.com.javainsider.app;

import br.com.javainsider.account.EncapsulatedAccount;

public class App6 {

    public static void main(String[] args) {
        final var account1 = new EncapsulatedAccount("1234");
        final var account2 = new EncapsulatedAccount("4321", 1000);

        account1.printBalance();
        account1.deposit(1000);
        account1.printBalance();
    }
}
