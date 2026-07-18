# Exercícios de arrays em Java

Coleção de exercícios desenvolvidos para praticar arrays, matrizes e operações sobre conjuntos de valores em Java. O repositório funciona como registro de aprendizagem e preserva soluções simples que poderão ser refatoradas futuramente.

## Objetivo

Consolidar o uso de estruturas indexadas e melhorar o raciocínio necessário para percorrer, transformar, comparar e calcular valores armazenados em arrays.

## Progresso atual

- Exercícios desenvolvidos: 20
- Linguagem: Java
- Status: em andamento

## Conceitos praticados

- Declaração e inicialização de arrays
- Percurso com `for` e `for-each`
- Matrizes bidimensionais
- Soma e média de valores
- Média ponderada e média móvel
- Filtros por condição
- Contadores e acumuladores
- Números primos
- Padrões, diagonais e tabuleiro
- Triângulo de Pascal

## Estrutura

~~~text
src/
└── ExercicioArray/
    ├── Exercicio01.java
    ├── Exercicio02.java
    └── ...
~~~

Cada classe possui um método `main` e representa uma solução independente.

## Como executar

Para compilar e executar um exercício a partir da raiz do repositório:

~~~bash
javac -d out src/ExercicioArray/Exercicio20.java
java -cp out ExercicioArray.Exercicio20
~~~

Também é possível abrir o projeto no IntelliJ IDEA e executar diretamente a classe escolhida.

## Principais aprendizados

- Controlar corretamente índices e limites
- Evitar acesso a posições inexistentes
- Diferenciar tamanho do array e último índice
- Usar acumuladores e contadores
- Evitar divisão por zero
- Aplicar conversão de tipo em cálculos de média
- Separar valores fixos da lógica de repetição
- Tornar nomes de variáveis mais claros

## Observação sobre as soluções

Os exercícios foram produzidos durante o aprendizado. Algumas soluções priorizam clareza e simplicidade, enquanto outras poderão receber melhorias de nomenclatura, reutilização de métodos e validação.

O código original é preservado sempre que possível para demonstrar a evolução.

## Próximos passos

- Revisar exercícios com lógica repetida
- Praticar `ArrayList` e outras Collections
- Padronizar gradualmente nomes de pacotes
- Adicionar testes aos cálculos mais relevantes
