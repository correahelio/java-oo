# java-oo
Projeto criado com objeto de explicar conceitos básicos de programação e orientação a objeto em Java

# Divisão de branches
Cada branch terá o conteúdo de um conceito
Cada branch terá um ou mais exercícios para fixar o conhecimento abordado

Essa é a branch-2 que corresponde ao Exercicio 2

# Conceito
Nosso sistema precisa receber dados do nosso usuário.
Para isso, vamos mostrar como capturar dados do teclado.

1 - Dentro do pacote 'com.java.oo' crie uma classe chamada 'EntradaUsuario'

Repare que já estamos abordando um conceito comum em programação.
Se vc já leu sobre OO (Orientação a Objetos) já escutou a famosa frase "Baixo acoplamento e Alta Coesão".
Em breve vc vai entender o que isso significa. Porém, nesse momento, vc tem que entender que estamos desenhando as classes com responsabilidades únicas.
Além disso, elas precisam ter um nome intuitvo para explicar o que ela faz apenas pelo nome.
Pensa que um novo desenvolvedor vai começar a trabalhar no nosso projeto.

Para isso, faz sentido a classe chamar-se 'ExibirDados' sendo que ela estará programada para capturar dados que o cliente digitar ?
Espero que sua resposta tenha sido não! :)

Portanto, nesse momento, vc já aprendeu a lição básica de orientação a objetos. Alta coesão. Grave esse nome, falaremos muito disso.
Na verdade, vc como DEV tem que se perguntar constantemente: "Meu código está com alta coesão ?"
A resposta deve ser sim (sempre que possível).

Relembrando alta coesão:
Suas classes, métodos e variáveis precisam estar desenhadas com única responsabilidade e nome intuitivo.


A classe 'EntradaUsuario' deve ficar com o seguinte conteúdo:

````
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
````

2 - Teste a classe criada entendendo a diferença entre os tipos de diferença

3 - Quando o sistema pedir um número inteiro digite um texto. Veja o que acontece.

4 - Faça o mesmo para variável que guarda o valor de 'número real'.
Veja a diferença entre digitar os seguintes valores:
- 5.0
- 5,0

5 - Vc viu que quando digitamos o valor 5,0 o sistema capturou o valor mas na hora de exibir ele exibiu 5.0 ?
Isso acontece porque para a linguagem Java todos os valores do tipo Double usam como separador decimal o ponto (.)
Para nós, humanos (usuários) usamos o separador decimal vírgula (,)
Por isso nós digitamos o valor de 5,0 e o sistema (java) vai transformar isso em 5.0

Isso é uma breve explicação sobre números reais em Java. Esse assunto vale um exercício e uma explicação separada no futuro, mas não agora. 


Nesse momento é importante entender a diferença de tipos de variáveis. Os tipos abordados foram:
- String
- Integer
- Double


# O que aprendemos ?

Na aula 2, aprendemos:
- Capturar dados do usuário
- Diferença entre tipos de variáveis (String, Integer e Double)
- Além disso, tivemos uma rápida explicação sobre número Double. 

 



 
