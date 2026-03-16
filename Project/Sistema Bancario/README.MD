# Sistema Bancário em Java

## Descrição

Este é um **mini sistema bancário em Java**, desenvolvido para aplicar conceitos de **Programação Orientada a Objetos (POO)**.  
O programa permite criar contas, fazer depósitos, saques e calcular o saldo com uma taxa de 5%.  

Ele possui **menu interativo** para o usuário e segue boas práticas de POO, utilizando **encapsulamento**, **getters**, **setters** e métodos para operações da conta.

---

## Funcionalidades

- Criar conta com **número** e **titular**
- Registrar **depósito inicial** opcional
- Menu interativo com opções:
  1. Depositar
  2. Sacar
  3. Calcular saldo com taxa de 5%
  4. Sair
- Validação de **saldo insuficiente** no saque
- Cálculo de saldo com taxa de 5%

---

## Estrutura do Projeto


banco/ -> Pacote com a classe Banco
Banco.java -> Classe que representa a conta bancária
aplication/ -> Pacote com a classe Main
Main.java -> Classe principal com menu e interações do usuário


### Classe Banco

- Atributos privados: `numero`, `titular`, `saldo`, `taxa`
- Métodos:
  - `depositar(double valor)` → adiciona saldo
  - `sacar(double valor)` → subtrai saldo, com validação
  - `getSaldo()` → retorna saldo atual
  - `calcularTaxa()` → retorna saldo após desconto de 5%
  - `getNumero()` e `getTitular()` → retorna informações da conta

---

### Classe Main

- Lê dados do usuário via `Scanner`
- Cria conta com número e titular
- Pergunta sobre depósito inicial
- Exibe menu de operações dentro de loop `while(menu)`:
  - Opções de depósito, saque, cálculo de taxa e sair
- Mostra informações atualizadas da conta a cada operação

---

## Exemplo de Uso

```bash

Digite o número da sua conta: 123
Digite o nome do titular: Lucas
Deseja fazer depósito inicial? (s/n): s
Digite o valor do depósito inicial: R$ 500

=== Menu Banco ===
Conta: 123 | Titular: Lucas
Saldo: R$ 500.0
1 - Depositar
2 - Sacar
3 - Calcular saldo com taxa
4 - Sair
Escolha uma opção: 2
Quanto deseja sacar? R$ 200
Saque realizado com sucesso!