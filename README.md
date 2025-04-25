# 🥦 API - FoodRescue

**Sistema de Redistribuição de Alimentos (Back-End)**  
Projeto desenvolvido para a disciplina de **Java Advanced**, com entregas semanais conforme o conteúdo da matéria avança.

---

## 🚀 Tecnologias Usadas

- Java 17
- Spring Boot 3.4.3
- Maven
- API REST
- JPA / Hibernate
- H2 Database (banco em memória)
- Postman (para testes)

---

## 🛠️ Como Rodar o Projeto

### 1. Pré-requisitos
- Java JDK 17 ou superior instalado
- Maven instalado (ou utilizar o wrapper `mvnw`)
- IDE (IntelliJ, VS Code, Eclipse)

### 2. Clonar o repositório
```bash
git clone https://github.com/BeatrizFerreira01/FoodRescue-BackEnd.git
```

### 3. Navegar até a pasta do projeto
```bash
cd food-rescue-api
```

### 4. Rodar o projeto
No terminal, execute:
```bash
./mvnw spring-boot:run
```
Ou, no Windows:
```bash
mvnw.cmd spring-boot:run
```

---

## 📁 Estrutura de Pastas

```
src/
├── main/
│   ├── java/br/com/foodrescue/        # Código-fonte da API
│   │   ├── controllers/               # Endpoints REST
│   │   ├── models/                    # Entidades JPA
│   │   ├── repositories/              # Interfaces JPA
│   │   ├── services/                  # Lógica de negócio
│   │   └── FoodRescueApplication.java# Classe principal
│   └── resources/
│       ├── application.properties     # Configurações da aplicação
│       └── data.sql / schema.sql      # Scripts de banco (se houver)
```

---

## ✅ Funcionalidades

- Cadastro de alimentos
- Listagem de doações
- CRUD completo para entidades principais
- Banco H2 configurado para testes em memória
- Tratamento básico de erros
- Pronto para evoluir com autenticação e filtros

---

## 👩‍💻 Desenvolvedoras

- Beatriz Ferreira Cruz  
- Bárbara Dias Santos

---

## 📚 Observações Finais

Este projeto está em constante evolução, sendo desenvolvido em etapas conforme os conteúdos abordados na disciplina de Java Advanced.  
Cada sprint semanal entrega uma nova funcionalidade ou melhoria de código e arquitetura.
