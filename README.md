# Java-OO
Projeto criado com objeto de explicar conceitos básicos de programação e orientação a objeto em Java
Vc pode usar a IDE que preferir, porém, esse projeto será abordado usando Intellij.

# Divisão de branches
Cada branch terá o conteúdo de um conceito
Cada branch terá um ou mais exercícios para fixar o conhecimento abordado

Essa é a branch-1 que corresponde ao Exercicio 1

# Conceito
Primeiro passo é criarmos a estrutura de pacotes Java. Os pacotes servem para organizar nosso código
Como boa prática, sempre criamos um pacote raiz com um nome que seja relacionado com o projeto em que estamos trabalhando.

1 - Crie uma pasta chamada 'src'
2 - Dentro da pasta 'src' crie uma pasta chamada 'main'
3 - Dentro da pasta 'main' crie uma pasta chamada 'java'

Agora que temos a estrutura principal onde ficarão todas as nossas classes Java. Vamos criar um pacote principal

4 - Dentro da pasta 'src/main/java' crie um pacote chamado 'com.java.oo'
5 - Dentro desse pacote, crie uma classe Main.java com o seguinte conteúdo:

````
package com.java.oo;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Criando nossa primeira classe!");
    }
}
````

6 - Rode a classe Main.java (botão direito mouse > Run). A saída do console deve ser:
````
"Criando nossa primeira classe!"
````

7 - O projeto final ficará com a seguinte estrutura:
![image](https://user-images.githubusercontent.com/22084402/154183390-ca0f73e1-4e87-4888-b4b0-3ab59f44b6ad.png)


 
# O que aprendemos ?
Na aula 1, aprendemos:
- Criar um projeto com estrutura de pasta (src/main/java)
- Criar um projeto com estrutura de pacote (com.java.oo)
- Rodar uma classe em java.
