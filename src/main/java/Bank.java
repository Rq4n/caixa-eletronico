package main.java;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    //Gerenciador de contas
    private List<Account> contas = new ArrayList<>();
    private int contadorId = 1;

    //Adicionar usuario
    public void criaUsuario(String nome, String cpf, String senha) {
        Account novoUsuario = new Account(contadorId, nome, cpf, senha);
        contas.add(novoUsuario);
        contadorId++;
    }

    //Listar usuarios
    public void exibirUsuario(String cpf, String senha) {
        for (Account contas : contas) {
            if (cpf != contas.getCpf()){
                System.out.println("Cpf Invalido");
            } else {
                System.out.println(contas);
            }
        }
        for (Account contas : contas) {
            if (senha != contas.getSenha()){
                System.out.println("Senha Invalida");
            } else {
                System.out.println(contas);
            }
        }
    }
}