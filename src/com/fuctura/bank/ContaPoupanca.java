package com.fuctura.bank;

import com.fuctura.bank.ContaCorrente;

public class ContaPoupanca extends Conta {

    // Construtor
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    // Método para resgatar valores da Conta-Poupança para a Conta-Corrente
    public void resgatar(double valor, ContaCorrente corrente) {
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            corrente.depositar(valor);
            System.out.printf("Valor de R$ %.2f resgatado da Conta-Poupança com sucesso. %n", valor);
        } else {
            System.out.println("Saldo insuficiente para resgatar da Conta-Poupança.");
        }
    }

    // Método para aplicar valores na Conta-Poupança
    public void aplicar(double valor) {
        setSaldo(getSaldo() + valor);
        System.out.printf("Valor de R$ %.2f aplicado na Conta-Poupança com sucesso. %n", valor);
    }

    // Método para exibir dados específicos da Conta-Poupança
    @Override
    public void exibirDados() {
        System.out.println("Conta-Poupança - Número: " + getNumero() +
                ", Titular: " + getTitular() +
                ", Saldo: R$" + getSaldo());
    }
}
