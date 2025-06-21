package main.java;

public class Main {
    public static void main(String[] args) {
        Bank manager = new Bank();
        manager.criaUsuario("Ryan","12345","senha1");
        manager.criaUsuario("Ry","123", "123");
        Account user1 = manager.autenticar("12345","senha1");
        Account user2 = manager.autenticar("123", "123");
        System.out.println("========");
        user1.depositarSaldo(100);
        manager.transferirSaldo(user1,"123",100);
        manager.listarUsuarios();
    }
}