package main.java;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> contas = new ArrayList<>();
    private int contadorId = 1;

    public Account criaUsuario(String nome, String cpf, String senha) {
        if (buscarPorCpf(cpf) != null){
            throw new IllegalArgumentException("CPF já cadastrado.");
        }
        Account novoUsuario = new Account(contadorId, nome, cpf, senha, this);
        contas.add(novoUsuario);
        contadorId++;
        return novoUsuario;
    }

    public Account autenticar(String cpf, String senha) {
        for (Account conta : contas) {
            if (conta.getCpf().equals(cpf) && conta.getSenha().equals(senha)) {
                System.out.println("Conta autenticada: " + contas);
                return conta;
            }
        }
        return null;
    }

    public Account buscarPorCpf(String cpf) {
        for (Account conta : contas) {
            if (cpf.equals(conta.getCpf())) {
                return conta;
            }
        }
        return null;
    }

    public void removerUsuario(int id) {
        boolean removida = contas.removeIf(contas -> contas.getId() == id);
        if (removida) {
            System.out.println("Usuario " + id + " removido");
        } else {
            System.out.println("Usuario " + id + " nao encontrado");
        }
    }

    //Listar usuarios
    public void listarUsuarios() {
        for (Account conta : contas) {
            System.out.println(conta);
        }
    }
}