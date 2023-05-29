package edu.oswaldo.firstweek;

public class AutomaticTellerMachine {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        else
            System.out.println("Saldo insuficiente");

        System.out.println(saldo);
    }
}
