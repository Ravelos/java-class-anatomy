package edu.oswaldo.firstweek;

import java.util.Scanner;

public class Mjiolnir {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int C = leitor.nextInt();
        String nome;
        int N;

// TODO: complete os espaços em branco com sua solução para o problema

        for (int i = 0; i < C; i++) {
            nome = leitor.next();
            N = leitor.nextInt();
            if (nome.equals("Thor")) System.out.println("Y");
            else System.out.println("N");
        }
    }


}
