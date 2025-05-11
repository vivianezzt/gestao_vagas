# Gestão de Vagas 🧑‍💻

Projeto desenvolvido em Java com Spring Boot para gerenciar candidatos e vagas de emprego. A aplicação oferece cadastro com validações, integração com banco de dados PostgreSQL, arquitetura modular baseada em boas práticas e separação por responsabilidades (Controller, Use Case, Repository, Entity, Exception).

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL (via Docker)
- Hibernate Validator
- Lombok
- Maven

---

## 📦 Estrutura do Projeto

```
gestao_vagas/
├── exceptions/
│   ├── ErrorMessageDTO.java             # DTO para mensagens de erro personalizadas
│   ├── ExceptionHandlerController.java  # Captura exceções globais e formata respostas
│   └── UserFoundException.java          # Exceção lançada ao tentar cadastrar um usuário já existente
│
├── modules/candidate/
│   ├── controllers/
│   │   └── CandidateController.java     # Endpoint REST para criar candidatos
│   ├── useCase/
│   │   └── CreateCandidateUseCase.java # Lógica de negócio para criação de candidatos
│   ├── CandidateEntity.java            # Entidade JPA representando a tabela 'candidates'
│   └── CandidateRepository.java        # Interface para persistência com Spring Data JPA
│
├── resources/
│   ├── application.properties           # Configurações da aplicação e do banco
│   └── static / templates               # (Pasta padrão para conteúdo web, não utilizada aqui)
│
├── docker-compose.yml                  # Sobe o container PostgreSQL com admin/admin
├── GestaoVagasApplication.java         # Classe principal com método main()
├── pom.xml                             # Dependências e configurações do Maven
└── test/                               # Testes unitários e de integração (em breve)
```

---

## ⚙️ Configuração do Banco de Dados (Docker)

```bash
docker-compose up -d
```

A aplicação irá se conectar automaticamente ao PostgreSQL com os dados abaixo:

```properties
spring.application.name=gestao_vagas
spring.datasource.url=jdbc:postgresql://localhost:5432/gestao_vagas
spring.datasource.username=admin
spring.datasource.password=admin
spring.jpa.hibernate.ddl-auto=update
```

---

## 🔁 Requisição de Criação de Candidato

```http
POST /candidate/
Content-Type: application/json

{
  "username": "vivianezzt",
  "name": "Viviane Aguiar",
  "email": "viviane@email.com",
  "password": "1234567890",
  "description": "Desenvolvedora Fullstack Java"
}
```

Resposta esperada (201 Created com JSON do candidato criado).

---

## 👩‍💻 Desenvolvido por

**Viviane Aguiar**  
[![LinkedIn](https://img.shields.io/badge/-LinkedIn-0A66C2?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/vivianezzt/)  
[![GitHub](https://img.shields.io/badge/-GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/vivianezzt)  
[![Instagram](https://img.shields.io/badge/-Instagram-E4405F?style=flat&logo=instagram&logoColor=white)](https://instagram.com/vivianezzt)

---

## 📌 Status do Projeto

✅ Setup inicial concluído  
✅ Banco de dados funcional com Docker  
✅ Cadastro de candidatos com validação e retorno estruturado  
🔜 Listagem e edição de candidatos  
🔜 Cadastro e gerenciamento de vagas