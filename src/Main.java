import com.fuctura.bank.ContaCorrente;
import com.fuctura.bank.ContaPoupanca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("====== Cadastro de sistema de conta Fuctura Bank ======%n%n");

        // Cadastro de uma conta
        System.out.print("Digite o nome do titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Deseja fazer um depósito inicial? (S/N): ");
        char escolha = scanner.next().charAt(0);
        double saldoInicial = 0.0;

        if (escolha == 'S' || escolha == 's') {
            System.out.print("Digite o valor do depósito inicial: ");
            saldoInicial = scanner.nextDouble();
        }

        System.out.println("\n-------- Dados da conta corrente ----------\n");
        ContaCorrente contaCorrente = new ContaCorrente(nomeTitular, saldoInicial);
        contaCorrente.exibirDados();

        System.out.println("\n-------- Operações da conta corrente ----------\n");
        contaCorrente.depositar(500.0);
        contaCorrente.sacar(200.0);

        System.out.println("\n-------- Dados Conta Poupança ----------\n");
        ContaPoupanca contaPoupanca = new ContaPoupanca(nomeTitular, 100.0);
        contaPoupanca.exibirDados();

        System.out.println("\n--------- Operações de contas (Corrente e Poupança) ----------\n");
        contaCorrente.aplicar(300.0, contaPoupanca);
        contaPoupanca.resgatar(50.0, contaCorrente);

        System.out.println("\n-------- Dados Finais ----------\n");
        contaCorrente.exibirDados();
        contaPoupanca.exibirDados();
    }


}