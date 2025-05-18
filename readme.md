# Desafio Controle de Fluxo - DIO

Este projeto foi desenvolvido como parte da **trilha Java Básico** da **DIO - Digital Innovation One**, com o objetivo de praticar conceitos de **controle de fluxo** e **tratamento de exceções** em Java.

---

##  Descrição do Desafio

O sistema recebe **dois parâmetros inteiros** via terminal e realiza a seguinte lógica:

- Calcula a quantidade de interações entre os dois números.
- Imprime no console mensagens no formato:  
  `"Imprimindo o número 1"`, `"Imprimindo o número 2"`, até a contagem total.

### ⚠️ Regras do desafio:

- Se o **primeiro número for maior que o segundo**, o sistema **lança uma exceção customizada** chamada `ParametrosInvalidosException`.
- A exceção exibe a seguinte mensagem:  
  `"O segundo parâmetro deve ser maior que o primeiro"`

---
## Como Executar
1. Compile os arquivos Java:
## Como Executar

1. Compile os arquivos Java:
   ```bash
   javac Contador.java ParametrosInvalidosException.java

2. Execute o programa:
    ```bash
   java Contador.java


