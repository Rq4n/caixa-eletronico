package main.java;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> contas = new ArrayList<>();
    private int contadorId = 1;

    public void criaUsuario(String nome, String cpf, String senha) {
        Account novoUsuario = new Account(contadorId, nome, cpf, senha, this);
        contas.add(novoUsuario);
        contadorId++;
    }

    public Account autenticar(String cpf, String senha) {
        for (Account contas : contas) {
            if (contas.getCpf().equals(cpf) && contas.getSenha().equals(senha)) {
                System.out.println("Conta autenticada: " + contas);
                return contas;
            }
        }
        return null;
    }

    public Account buscarPorCpf(String cpf) {
        for (Account contas : contas) {
            if (cpf.equals(contas.getCpf())) {
                return contas;
            }
        }
        System.out.println("CPF Inexistente");
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
        for (Account contas : contas) {
            System.out.println(contas);
        }
    }
}