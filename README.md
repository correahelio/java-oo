# java-oo
Projeto criado com objeto de explicar conceitos básicos de programação e orientação a objeto em Java

# Divisão de branches
Cada branch terá o conteúdo de um conceito
Cada branch terá um ou mais exercícios para fixar o conhecimento abordado

Essa é a branch-4.1 que corresponde ao Exercicio 4.1

# Conceito
Nosso sistema precisa executar algumas açõs repetitivas.
Para isso, vamos mostrar alguns exemplos de repetição.

1 - Dentro do pacote 'com.java.oo' crie um pacote chamado 'repeticao'

2 - Dentro do pacote 'repeticao' crie uma classe chamada RepeticaoComFor.java com o seguinte conteúdo:

```
package com.java.oo.repeticao;

import java.util.Scanner;

public class RepeticaoComFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto:");
        String texto = scanner.next();
        System.out.println("O texto digitado foi: " + texto);

        System.out.println("Digite um texto:");
        texto = scanner.next();
        System.out.println("O texto digitado foi: " + texto);

        System.out.println("Digite um texto:");
        texto = scanner.next();
        System.out.println("O texto digitado foi: " + texto);

    }
}
```

3 - Vc reparou que o nosso código está capturando 3 mensagens de texto que o usuário digitou ?
Legal, nosso código funcionou muito bem.

Agora imagina que precisamos alterar nosso sistema para capturar 20 mensagens de texto do usuário.
Como ficaria nosso código ?

Provavelmente ficaria bem extenso (com várias linhas) e com bastante código repetitivo.

Na programação, a repetição de código deve ser evitada. Isso é uma boa prática de programação.

Para isso, vamos aprender a repetição usando 'for'.

Vamos alterar o conteúdo da nossa classe para ficar da seguinte maneira:

```
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
```

4 - Vc reparou que nosso código está fazendo a mesma coisa que antes ?

Agora se quisermos alterar nosso sistema para capturarmos 20 textos de usuário, 
precisamos apenas alterar a quantidade de repetições que desejamos.

Agora, vamos as explicações de como funciona um 'for' em Java:


A primeira parte do 'if' é a declaração. 
Declaramos uma variável com o nome 'i' do tipo 'int' e iniciamos ela com valor de 0 (zero).

![image](https://user-images.githubusercontent.com/22084402/154380221-b92c364a-0d08-4340-97dd-e124ac13903b.png)

A segunda parte do 'if' é a validação. 
O trecho da validação é executado toda vez antes da repetição ocorrer.
Se a expressão de validação for 'true' o sistema vai executar o bloco de código.
Se a expressão de validação for 'false' o sistema vai pular o bloco de repetição e seguir para a próxima linha após o bloco de repetição. 

No nosso exemplo o sistema vai entrar dentro da repetição sempre que 'i < 3'. Ou seja:
- Se i = 0 o bloco será executado.
- Se i = 1 o bloco será executado.
- Se i = 2 o bloco será executado.
- Se i = 3 o bloco NÃO será executado.

![image](https://user-images.githubusercontent.com/22084402/154380281-2745c6e3-bd4b-4b66-8aeb-ee0b12521c90.png)

A última parte do 'if' é executada após a última linha do bloco de código.

Ou seja, após a execução da linha abaixo será executada a última parte do 'if':

System.out.println("O texto digitado foi: " + texto);

Após a linha acima, o sistema vai executar a terceira parte do 'if' que é 'i++'.
Nesse caso, estamos aumentando o valor da variável 'i'.

O código 'i++' é a mesma coisa que 'i = i + 1'; 


![image](https://user-images.githubusercontent.com/22084402/154380309-7db4a992-ec6f-4cae-a968-4945ff568767.png)

5 - Faça testes com o 'for' para fixar o seu conhecimento.


# O que aprendemos ?

Na aula 4.1, aprendemos:
- Repetição com 'for'
