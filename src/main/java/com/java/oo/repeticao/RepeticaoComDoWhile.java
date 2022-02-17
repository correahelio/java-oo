package com.java.oo.repeticao;

import java.util.Scanner;

public class RepeticaoComDoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer numero = null;
        do {
            System.out.println("Digite um número:");
            numero = scanner.nextInt();
            System.out.println("O número digitado foi: " + numero);
        } while(numero > 0);
    }
}
