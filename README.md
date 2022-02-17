# java-oo
Projeto criado com objeto de explicar conceitos básicos de programação e orientação a objeto em Java

# Divisão de branches
Cada branch terá o conteúdo de um conceito
Cada branch terá um ou mais exercícios para fixar o conhecimento abordado

Essa é a branch-4.2 que corresponde ao Exercicio 4.2

# Conceito
Nosso sistema precisa executar algumas açõs repetitivas.
Para isso, vamos mostrar alguns exemplos de repetição.

1 - Dentro do pacote 'repeticao' crie uma classe chamada RepeticaoComDoWhile.java com o seguinte conteúdo:

```
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
```

2 - Repare que nosso código vai ser executado enquanto o usuário digitar um valor maior que 0.

3 - Ou seja, nesse caso não sabemos quantas vezes nosso código pode ser executado.

Ele pode ser executado 1 vez, ou 100 vezes. Depende do usuário do nosso sistema.

Portanto, usamos a repetição 'do-while' quando queremos executar pelo menos 1 vez um bloco de código.


Agora vamos para outro exemplo.

```
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
```
 
 4 - Nesse exemplo vemos que o nosso código pode ou não executar o bloco de repetição.
 
 Após o usuário digitar 2 números o sistema valida:
 
 - Se a expressão 'número1 > número2' for verdadeiro ele vai executar o bloco de repetição.
 - Se a expressão 'número1 > número2' for false ele vai terminar a execução.
 
 
 5 - Portanto, nesse caso, nosso sistema pode ou não executar o bloco de repetição.
 
 6 - Teste as 2 classes criadas, veja a diferença entre elas.
 
 7 - A estrutura final do projeto ficará assim:
 ![image](https://user-images.githubusercontent.com/22084402/154383713-a79ad2cc-54ad-4815-a10b-a4d3aab19e55.png)
 
 8 - A diferença entre eles é que:
 - A repetição 'do-while' o bloco de repetição será executado ao menos uma vez.
 
 O sistema primeiro executa ('do') e depois faz a validação para verificar se deve executar novamente ('while').
 Por isso chamamos a repetição de 'do-while'.
 
 
 - A repetição 'while' pode ou não ser executada. Depende da validação.
 
 O sistema primeiro valida ('while') para então decidir se deve ou não executar.
 
 
# O que aprendemos ?

Na aula 4.2, aprendemos:
- Método de repetição 'do'
- Método de repetição 'do-while'

# Vamos exercitar o que aprendemos até aqui ? - Exercício 1

1 - Crie um sistema que capture 5 números que o usuário digitar.

2 - Após capturar todos os números o sistema deve somar todos eles e exibir o resultado.

### Caso de teste 1:
Exemplo quando o usuário digitar os números: 1, 2, 7, 10, 10:

- A saída do sistema deve ser: 30

# Vamos melhorar ? - Exercício 2

1 - Crie um sistema que capture números que o usuário digitar.

## Regra de negócio:
Se a soma dos números digitados for maior ou igual a 50 o sistema deve parar a execução.

 ### Caso de teste 1: 
 
Exemplo quando o usuário digitar os seguintes números: 
- 10  : O sistema vai continuar executando
- 10  : O sistema vai continuar executando
- 10  : O sistema vai continuar executando
- 20  : O sistema vai parar a execução.


# Vamos melhorar ? - Exercício 3
1 - Crie um sistema que capture dois números que o usuário digitar.

2 - Se a multiplicação dos 2 números for maior que 100 o sistema deve continuar executando.

3 - Se o último número digitado for 1 o sistema deve parar a execução.

### Caso de teste 1: 
 Exemplo quando o usuário digitar os números 10 e 10 o sistema vai parar de executar.
 
### Caso de teste 2: 
  Exemplo quando o usuário digitar os números 10 e 20 o sistema vai continuar executando.
  
### Caso de teste 3: 
  Exemplo quando o usuário digitar os números 50 e 2 o sistema vai parar de executar.
  
### Caso de teste 4: 
  Exemplo quando o usuário digitar os números 100 e 1 o sistema vai parar de executar.
  
### Caso de teste 5: 
  Exemplo quando o usuário digitar os números 200 e 1 o sistema vai parar de executar.
  
### Caso de teste 6: 
  Exemplo quando o usuário digitar os números 56 e 2 o sistema vai continuar executando.
