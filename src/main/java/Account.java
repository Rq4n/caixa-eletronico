package main.java;

public class Account {
    //Usuarios, id, cpf, nome, senha, saldo
    private int id;
    private String cpf;
    private String nome;
    private String senha;
    private double saldo;

    public Account(String cpf, String nome, String senha){
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
    }
    public void depositarSaldo(double valor){
        valor = valor;
        if (valor > 0){
            saldo += valor;
        }
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setSenha(){
        this.senha = senha;
    }
    public String getSenha(){
        return senha;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public int getId(){
        return id;
    }
    @Override
    public String toString(){
        return "ID: "+id+" | Cpf: "+cpf+" | Nome: "+nome+" | Senha: "+senha+" | Saldo:"+saldo;
    }
}
