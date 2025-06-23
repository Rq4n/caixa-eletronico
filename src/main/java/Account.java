package main.java;

public class Account {
    private int id;
    private String cpf;
    private String nome;
    private String senha;
    private double saldo;
    private Bank banco;

    //Falta consultar saldo
    public Account(int id, String nome, String cpf, String senha, Bank banco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.banco = banco;
    }

    public void transferirSaldo(String cpfDestino, double valor) {
        if (this.cpf.equals(cpfDestino)) {
            System.out.println("Nao eh possivel transferir para a propria conta");
            return;
        }

        Account contaDestinoObj = banco.buscarPorCpf(cpfDestino);

        if (contaDestinoObj == null) {
            System.out.println("CPF Invalido para transacao");
            return;
        }

        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");
        }

        if (this.saldo <= 0) {
            System.out.println("Saldo Insuficiente");
        }

        this.sacarSaldo(valor);
        contaDestinoObj.depositarSaldo(valor);

        System.out.println("Transferência de R$" + valor + " realizada com sucesso para " + cpfDestino);

    }

    public void depositarSaldo(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor invalido para deposito");
        }
        this.saldo += valor;
    }

    public void sacarSaldo(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valo invalido para saque");
        }
        if (valor > 0) {
            this.saldo -= valor;
        } else {
            throw new IllegalArgumentException("Saldo insuficiente para saque");
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
