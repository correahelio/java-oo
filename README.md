# java-oo
Projeto criado com objeto de explicar conceitos básicos de programação e orientação a objeto em Java

# Divisão de branches
Cada branch terá o conteúdo de um conceito
Cada branch terá um ou mais exercícios para fixar o conhecimento abordado

Essa é a branch-3 que corresponde ao Exercicio 3

# Conceito
Nosso sistema precisa receber dados do nosso usuário e tomar algumas decisões.
Para isso, vamos mostrar alguns exemplos.

1 - Dentro do pacote 'com.java.oo' crie um pacote chamado 'decisao'

2 - Dentro do pacote 'decisao' crie uma classe chamada DecisaoNumeros.java com os seguinte conteúdo:

```
package com.java.helio;

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
```

3 - Nessa classe mostramos que pode existir um fator de decisão 'if'
E o 'if' não precisa ter um else. Ou seja, a primeira decisão que fizemos não tem else.
Já a segunda decisão que fizemos, tem um else.

Portanto, vimos que o else é um trecho de código opcional (não obrigatório) em uma tomada de decisão


4 - Vamos a mais um exemplo de tomada de decisão

Dentro do mesmo pacote 'com.java.oo.decisao' crie uma classe chamada 'OutraDecisaoNumeros.java' com o seguinte conteúdo:

```
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
```

Nesse exemplo, usamos a decisão através do switch case. 


A estrutura final do projeto ficará assim:
![image](https://user-images.githubusercontent.com/22084402/154192436-96b425ad-d221-4e73-9ca1-9b5e39594e69.png)



5 - Execute os códigos acima. Faça testes com números diferentes.

# O que aprendemos ?

Na aula 3, aprendemos:
- Decisão com if
- Decisão com if/else
- Decisão com switch case

# Vamos exercitar o que aprendemos até aqui ? - Exercício 1

1 - Crie um sistema que capture a idade do usuário.
A idade do usuário é um número inteiro.

2 - Se o usuário for menor de idade nosso sistema deve exibir a mensagem:
"Usuário é menor de idade".

3 - Se o usuário for maior de idade nosso sistema deve exibir a mensagem:
"Usuário é maior de idade".


# Vamos melhorar ? - Exercício 2 
1 - Crie um sistema que capture a idade do usuário.
A idade do usuário é um número inteiro.

2 - Se o usuário tiver:
- Mais que 10 anos o sistema deve mostrar: "Usuário tem mais que 10 anos"
- Menos que 20 anos o sistema deve mostrar: "Usuário tem menos que 20 anos"
- 20 anos o sistema deve mostrar: "Usuário tem 20 anos"
- Qualquer outra idade o sistema deve mostrar: "Usuário tem mais que 20 anos"

## Regra de negócio:

O sistema só pode exibir uma única mensagem de saída.

### Casos de teste 1:

Exemplo quando o usuário digitar que tem 5 anos:
- A saída do sistema deve ser: "Usuário tem menos que 20 anos".

### Casos de teste 2:

Exemplo quando o usuário digitar que tem 10 anos:
- A saída do sistema deve ser: "Usuário tem menos que 20 anos".

### Casos de teste 3:

Exemplo quando o usuário digitar que tem 11 anos:
- A saída do sistema deve ser: "Usuário tem mais que 10 anos".

### Casos de teste 4:
Exemplo quando o usuário digitar que tem 20 anos:
- A saída do sistema deve ser: "Usuário tem 20 anos".

### Casos de teste 5:

Exemplo quando o usuário digitar que tem 21 anos:
- A saída do sistema deve ser: "Usuário tem mais que 20 anos".


# Vamos melhorar ? - Exercício 3 
1 - Crie um sistema que capture a idade de 2 usuários.
As idades dos usuários devem ser do tipo inteiro.

## Regra de negócio:

- Se a idade do Usuário 1 for maior que a idade do Usuário 2 o sistema deve exibir a mensagem:
"Usuário 1 é mais velho!"

- Se a idade do Usuário 2 for maior que a idade do Usuário 1 o sistema deve exibir a mensagem:
"Usuário 2 é mais velho!"

- Se a idade deles forem iguais o sistema deve exibir a mensagem:
"Os usuários têm a mesma idade!"

- Se a soma da idade dos 2 usuários for um número par o sistema deve exibir a mensagem:
"A soma das idades é correspondente a um número par"

- Se a soma da idade dos 2 usuários for um número ímpar o sistema deve exibir a mensagem:
"A soma das idades é correspondente a um número ímpar"


### Caso de teste 1:
- Se o usuário 1 digitar que tem 10 anos e se o usuário 2 digitar que tem 20 anos o sistema deve exibir:

"Usuário 2 é mais velho!"

"A soma das idades é correspondente a um número par"

### Caso de teste 2:
- Se o usuário 1 digitar que tem 20 anos e se o usuário 2 digitar que tem 10 anos o sistema deve exibir:

Usuário 1 é mais velho!

"A soma das idades é correspondente a um número par"

### Caso de teste 3:
- Se o usuário 1 digitar que tem 15 anos e se o usuário 2 digitar que tem 16 anos o sistema deve exibir:

Usuário 2 é mais velho!

"A soma das idades é correspondente a um número ímpar"

### Caso de teste 4:
- Se o usuário 1 digitar que tem 15 anos e se o usuário 2 digitar que tem 15 anos o sistema deve exibir:

"Os usuários têm a mesma idade!"

"A soma das idades é correspondente a um número par" 
