package main.java;

public class Account {
    // A Classe Account serve como um meio para o usuario realizar operacoes que interfiram na sua propria conta
    // para ter interacoes entre contas como transferirSaldo ele deve ficar na classe bank
    //Usuarios, id, cpf, nome, senha, saldo
    private int id;
    private String cpf;
    private String nome;
    private String senha;
    private double saldo;

    //Falta consultar saldo
    public Account(int id, String nome, String cpf, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }
    public void depositarSaldo(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor invalido para deposito");
        }
        this.saldo += valor;
    }
    public void sacarSaldo(double valor) {
        if (saldo > 0) {
            this.saldo -= valor;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Cpf: " + cpf + " | Nome: " + nome + " | Senha: " + senha + " | Saldo:" + saldo;
    }
}
