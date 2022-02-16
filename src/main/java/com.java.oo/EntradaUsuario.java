package com.java.oo;

import java.util.Scanner;

public class EntradaUsuario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto:");
        String texto = scanner.next();
        System.out.println("O texto digitado foi: " + texto);

        //Adicionado apenas para organizar o código de saída
        System.out.println();

        System.out.println("Digite um número inteiro:");
        Integer numero = scanner.nextInt();
        System.out.println("O número digitado foi: " + numero);

        //Adicionado apenas para organizar o código de saída
        System.out.println();

        System.out.println("Digite um número real:");
        Double numeroReal = scanner.nextDouble();
        System.out.println("O número real digitado foi: " + numeroReal);
    }
}
