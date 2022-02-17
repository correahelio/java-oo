package com.java.oo.repeticao;

import java.util.Scanner;

public class RepeticaoComWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        Integer numero1 = scanner.nextInt();

        System.out.println("Digite outro número:");
        Integer numero2 = scanner.nextInt();

        while(numero1 > numero2) {
            System.out.println("Digite mais um número:");
            numero1 = scanner.nextInt();
        }
    }
}
