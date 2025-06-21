package main.java;

import javax.swing.*;
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
    public void autenticar(String cpf, String senha) {
        if (contas.isEmpty()) {
            System.out.println("Prencher CPF e Senha");
        }
        for (Account contas : contas) {
            if (cpf != contas.getCpf() || senha != contas.getSenha()) {
                System.out.println("CPF ou Senha Invalida");
            } else {
                System.out.println(contas);
            }
        }
    }

    //Buscar por cpf
    public void buscarPorCpf(String cpf) {
        for (Account contas : contas){
            if (cpf.equals(contas.getCpf())){
                System.out.println("CPF Existente");
            } else {
                System.out.println("CPF Inexistente");
            }
        }
    }
}