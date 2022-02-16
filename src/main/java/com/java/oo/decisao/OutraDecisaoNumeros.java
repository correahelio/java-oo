package com.java.helio;

import java.util.Scanner;

public class OutraDecisaoNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        Integer numero = scanner.nextInt();

        //Adicionado para organizar o código
        System.out.println();

        switch (numero) {
            case 10:
                System.out.println("Numero digitado é 10");
                break;
            case 20:
                System.out.println("Numero digitado é 20");
                break;
            default:
                System.out.println("Numero digitado é diferente de 10 e 20");
                break;
        }
    }
}
