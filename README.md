# 🥷 Sistema de Cadastro de Ninjas

Bem-vindo ao **Sistema de Cadastro de Ninjas**!  
Este projeto é uma aplicação baseada em **arquitetura em camadas**, desenvolvida com **Spring Boot**, com o objetivo de gerenciar ninjas e suas respectivas missões.

Além disso, o projeto inclui conteúdos extras aprofundando conceitos de **banco de dados**, tornando-o também uma excelente base de estudo.

---

## 📌 Visão Geral do Projeto

O sistema permite o gerenciamento de **ninjas** e **missões**, com as seguintes regras:

- Cada **ninja** pode estar associado a **uma única missão**
- Cada **missão** pode ter **vários ninjas**

### 🚀 Funcionalidades

- Cadastro de ninjas com:
  - Nome
  - Idade
  - Email
  - Rank
- Atribuição de missão a um ninja
- Gerenciamento de missões
- Listagem de ninjas associados a cada missão

---

## 🛠️ Tecnologias Utilizadas

- **Spring Boot** → Criação da aplicação web
- **Spring Data JPA** → Integração com banco de dados
- **H2 Database** → Banco em memória para testes
- **Flyway** → Controle de migrações do banco
- **Maven** → Gerenciamento de dependências
- **Docker** → Execução externa do banco de dados
- **SQL** → Manipulação de dados
- **Git** → Controle de versão
- **GitHub** → Hospedagem do repositório

---

## 🗄️ Design do Banco de Dados

O sistema possui duas entidades principais:

### 🥷 Ninja
- id
- nome
- idade
- email
- rank

### 🎯 Missão
- id
- título
- descrição

### 🔗 Relacionamento

- Um **Ninja** → possui **uma Missão**
- Uma **Missão** → pode ter **vários Ninjas**

---

## ⚙️ Como Executar o Projeto

### 1️⃣ Clonar o repositório
```bash
git clone https://github.com/horaciomuller/CadastroDeNinjas.git
