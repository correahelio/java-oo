package com.java.oo.repeticao;

import java.util.Scanner;

public class RepeticaoComFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            System.out.println("Digite um texto:");
            String texto = scanner.next();
            System.out.println("O texto digitado foi: " + texto);
        }
    }
}
