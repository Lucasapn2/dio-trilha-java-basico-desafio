# Sistema Bancário Simples - Projeto DIO

## Descrição

Este projeto é uma implementação básica de um sistema bancário orientado a objetos em Java, desenvolvido para prática e aprendizado. Ele simula operações bancárias comuns, como depósito, saque, transferência e exibição de extratos, com as seguintes características:

- **Classes principais:** Conta (abstract), ContaCorrente, ContaPoupanca, Cliente
- **Funcionalidades:**
    - Depósito, saque e transferência entre contas
    - Limite de saques diários na Conta Poupança
    - Exibição de extratos formatados
- **Objetivo:** Praticar conceitos de orientação a objetos como herança, abstração, encapsulamento e polimorfismo.

---

## Estrutura do projeto

- `Cliente` — Representa o cliente do banco, contendo informações pessoais.
- `Conta` — Classe abstrata que define comportamentos e atributos comuns das contas bancárias.
- `ContaCorrente` — Conta corrente com operações básicas.
- `ContaPoupanca` — Conta poupança com limite diário de saques.
- `Main` — Classe principal para executar e testar o sistema.

---

## Funcionalidades implementadas

- Criar clientes e contas bancárias vinculadas a eles.
- Realizar depósitos, saques e transferências entre contas.
- Limitar o número de saques diários na conta poupança.
- Mostrar extrato bancário com informações detalhadas.

---

## Como executar

1. Certifique-se de ter o Java JDK instalado (versão 8 ou superior).
2. Clone este repositório ou copie os arquivos para sua IDE favorita (Eclipse, IntelliJ, NetBeans).
3. Compile e execute a classe `Main`.
4. Observe as operações simuladas no console.

---

## Próximas melhorias sugeridas

- Adicionar interface gráfica para melhor interação.
- Implementar persistência de dados (banco de dados ou arquivos).
- Criar validações mais robustas (saldo insuficiente, valores negativos).
- Adicionar outras modalidades de conta e funcionalidades (ex: conta salário, investimentos).
- Permitir múltiplos clientes e múltiplas contas por cliente.

---

## Autor

Lucas Ferreira

[GitHub](https://github.com/Lucasapn2)
