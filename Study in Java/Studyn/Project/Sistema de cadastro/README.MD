# Edu School - Sistema de Cadastro de Alunos

## Descrição
O **Edu School** é um sistema de cadastro de alunos desenvolvido em Java.  
Ele permite que o professor:

- Cadastre um usuário e senha para acessar o sistema
- Cadastrar, editar e visualizar informações de alunos
- Sair do sistema de forma segura

O projeto simula um **mini sistema administrativo de escola** e foi desenvolvido para fins acadêmicos.

---

## Funcionalidades

1. **Cadastro de usuário**: Criação de login e senha para acessar o sistema.
2. **Login seguro**: Usuário tem 3 tentativas para acessar o sistema.
3. **Menu principal**:
   - Cadastrar aluno (nome, turma e nota)
   - Editar aluno (nome, turma ou nota)
   - Mostrar aluno cadastrado
   - Sair do sistema
4. **Validação de dados**:
   - Nome e turma como `String`
   - Nota como `int`
5. **Tratamento de erros comuns de entrada**, evitando que o programa quebre.

---

## Tecnologias

- Linguagem: **Java**
- IDE recomendada: **IntelliJ IDEA**
- Estrutura de pastas:
  - `application` → classe principal `Main.java`
  - `cadastro` → classe `Cadastro.java` com métodos de CRUD

---

## Estrutura do Código

```src
application/
└── Main.java        # Inicia o programa e controla o menu
cadastro/
└── Cadastro.java    # Classe que armazena informações de aluno e métodos para CRUD