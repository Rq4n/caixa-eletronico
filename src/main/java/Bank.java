package main.java;

public class Bank {
    public static void main(String[] args) {
        Account conta = new Account("321312","ryan","123");
        conta.depositarSaldo(200);
        System.out.println(conta.toString());
    }
}
