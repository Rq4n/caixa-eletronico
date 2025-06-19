package main.java;

public class Main {
    public static void main(String[] args) {
        Bank manager = new Bank();
        manager.criaUsuario("Ryan","51694571890", "123123");
        manager.exibirUsuario("5169457189", "123123");

    }
}