package main.java;

import jdk.jshell.EvalException;

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

    //Logar usuario
    public Account autenticar(String cpf, String senha) {
        for (Account contas : contas) {
            if (contas.getCpf().equals(cpf) && contas.getSenha().equals(senha)) {
                System.out.println("Conta autenticada: "+contas);
                return contas;
            }
        }
        return null;
    }
    //Buscar por cpf
    public void buscarPorCpf(String cpf) {
        for (Account contas : contas) {
            if (cpf.equals(contas.getCpf())) {
                System.out.println("CPF Existente");
            } else {
                System.out.println("CPF Inexistente");
            }
        }
    }

    //Remover usuario
    public void removerUsuario(int id) {
        boolean removida = contas.removeIf(contas -> contas.getId() == id);
        if(removida) {
            System.out.println("Usuario "+id+" removido");
        } else {
            System.out.println("Usuario "+id+" nao encontrado");
        }
    }

    //Listar usuarios
    public void listarUsuarios() {
        for (Account contas : contas){
            System.out.println(contas);
        }
    }
}