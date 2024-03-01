package com.fuctura.bank;

public class ContaCorrente extends Conta {

    // Construtor
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    public void sacar(double valor){
            if (valor > 0 && valor <= getSaldo()) {
                setSaldo(getSaldo() - valor);
                System.out.printf("Saque de R$ %.2f realizado com sucesso. %n", valor);
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
    }

    public void aplicar(double valor, ContaPoupanca poupanca) {
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            poupanca.aplicar(valor);
            System.out.println("Valor de R$ " + valor + " aplicado na Conta-Poupança com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para aplicar na Conta-Poupança.");
        }
    }

    @Override
    public void exibirDados() {
        System.out.println("Conta-Corrente - Número: " + getNumero() +
                ", Titular: " + getTitular() +
                ", Saldo: R$" + getSaldo());
    }
}
