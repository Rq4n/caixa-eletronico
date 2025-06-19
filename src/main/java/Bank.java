package main.java;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    //Gerenciador de contas
    private List<Account> contas = new ArrayList<>();
    private int contadorId = 1;

    //Adicionar usuario
    public void criaUsuario(String nome, String cpf, String senha){
        Account novoUsuario = new Account (contadorId, nome, cpf, senha);
        contas.add(novoUsuario);
        contadorId++;
    }
}
