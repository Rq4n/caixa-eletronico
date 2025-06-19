package main.java;

public class Account {
    //Usuarios, id, cpf, nome, senha, saldo
    private int id;
    private String cpf;
    private String nome;
    private String senha;
    private double saldo;

    public Account(int id,String cpf, String nome, String senha){
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
        this.id = id;
    }
    public void depositarSaldo(double valor){
        if (valor >= 0){
            this.saldo += valor;
        }
    }
    public void sacarSaldo(double valor){
        if (saldo > 0){
            this.saldo -= valor;
        }
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setSenha(String senha){
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
    public int getId(){
        return id;
    }
    @Override
    public String toString(){
        return "ID: "+id+" | Cpf: "+cpf+" | Nome: "+nome+" | Senha: "+senha+" | Saldo:"+saldo;
    }
}
