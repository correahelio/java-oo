package com.java.oo.decisao;

import java.util.Scanner;

public class DecisaoNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        Integer numero = scanner.nextInt();

        //Adicionado para organizar o código
        System.out.println();

        if(numero > 10 ) {
            System.out.println("O número digitado é maior que 10");
        }

        if(numero > 50 ) {
            System.out.println("O número digitado é maior que 50");
        } else {
            System.out.println("O número digitado é menor que 50");
        }
    }
}
