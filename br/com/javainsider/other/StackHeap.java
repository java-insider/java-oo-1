package br.com.javainsider.other;

import br.com.javainsider.account.Account;

public class StackHeap {

    public static void main(String[] args) {

        Account a1 = new Account();
        a1.accountNumber = "A";

        Account a2 = new Account();
        a2.accountNumber = "B";

        Account a3 = new Account();
        a3.accountNumber = "C";

        a1 = a2;
        a1.accountNumber = "D";

        a3 = a2;
        a3.accountNumber = "E";
    }
}
