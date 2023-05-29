package edu.oswaldo.firstweek;

import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Declares  the variables and ask for their values to the user
        System.out.println("Por favor digite o numero da sua conta");
        Number contaNumero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor digite a agência");
        String agencia = scanner.next();
        scanner.nextLine();


        System.out.println("Por favor insira seu nome");
        String nomeCliente = scanner.next();
        scanner.nextLine();


        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta "+ contaNumero + " e seu saldo " + saldo +
                " já está disponível para saque");
        scanner.close();
    }
}
