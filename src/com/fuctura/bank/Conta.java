package com.fuctura.bank;

import java.util.Random;

public abstract class Conta {
    private String numero;
    private String titular;
    private double saldo;

    public Conta(){

    }

    // Construtor
    public Conta(String nomeTitular, double saldoInicial) {
        this.numero = gerarNumeroConta();
        this.titular = nomeTitular;
        this.saldo = saldoInicial;
    }

    // Método para gerar número de conta aleatório
    private String gerarNumeroConta() {
        Random random = new Random();
        for (int i = 0; i <= 6; i++) {
            setNumero(random.nextInt(10000) + "-" + random.nextInt(9));

        }
        return getNumero();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /*
    *   Métodos:
        Exibir Dados, Depositar, Exibir Saldo das Contas(Conta-Corrente e Conta Poupança)
    * */

    public void exibirDados() {
        System.out.printf("Saldo: R$ %.2f%n" , getSaldo() );
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado com sucesso. %n", valor);
    }
}
