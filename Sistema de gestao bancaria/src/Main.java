import entities.Conta;
import entities.ContaCorrente;
import entities.ContaInvestimento;
import entities.ContaPoupanca;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Conta> contas = new ArrayList<>();

        String operacao = "";
        while (!operacao.equalsIgnoreCase("0")){
            System.out.println("Digite o número correspondente ao tipo de conta deseja cadastrar ou para encerrar o programa:");
            System.out.println("(1-Conta Corrente / 2-Conta Poupança / 3-Conta Investimento / 0 - Encerrar o programa)");
            operacao = sc.nextLine();

            if (operacao.equalsIgnoreCase("1")){
                System.out.println("Insira o número da conta:");
                String numeroCorrente = sc.nextLine();
                System.out.println("Insira o titular da conta:");
                String titularCorrente = sc.nextLine();
                System.out.println("Insira o saldo da conta:");
                double saldoCorrente = sc.nextDouble();
                System.out.println("Insira o limite do cheque especial:");
                double chequeEspecial = sc.nextDouble();
                sc.nextLine();
                System.out.println("");

                ContaCorrente addCCorrente = new ContaCorrente(numeroCorrente,titularCorrente,saldoCorrente,chequeEspecial);
                contas.add(addCCorrente);

            }else if (operacao.equalsIgnoreCase("2")){
                System.out.println("Insira o número da conta:");
                String numeroPoupanca = sc.nextLine();
                System.out.println("Insira o titular da conta:");
                String titularPoupanca = sc.nextLine();
                System.out.println("Insira o saldo da conta:");
                double saldoPoupanca = sc.nextDouble();
                System.out.println("Insira a taxa de rendimento mensal:");
                double taxaRendimento = sc.nextDouble();
                sc.nextLine();
                System.out.println("");

                ContaPoupanca addCPoupanca = new ContaPoupanca(numeroPoupanca,titularPoupanca,saldoPoupanca,taxaRendimento);
                contas.add(addCPoupanca);

            }else if (operacao.equalsIgnoreCase("3")){
                System.out.println("Insira o número da conta:");
                String numeroInvestimento = sc.nextLine();
                System.out.println("Insira o titular da conta:");
                String titularInvestimento = sc.nextLine();
                System.out.println("Insira o saldo da conta:");
                double saldoInvestimento = sc.nextDouble();
                System.out.println("Insira a taxa de administração");
                double taxaAdmin = sc.nextDouble();
                sc.nextLine();
                System.out.println("");

                ContaInvestimento addCInvestimento = new ContaInvestimento(numeroInvestimento,titularInvestimento,saldoInvestimento,taxaAdmin);
                contas.add(addCInvestimento);

            }else if (operacao.equalsIgnoreCase("0")){
                System.out.println("Cadastro encerrado.");
                System.out.println("");

            } else {
                System.out.println("Digite uma resposta válida");
                System.out.println("");
            }
        }

        System.out.println("Dados das contas registradas:");
        System.out.println("");
        for (Conta i : contas){
            i.mostrarDados();
            System.out.println("");
        }

        System.out.println("Programa encerrado.");

        sc.close();
    }
}
