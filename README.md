<p align="center">
  <img src="./banner-github.jpg" alt="Banner do projeto Gestão de Vagas" width="100%">
</p>

<h1 align="center">Gestão de Vagas</h1>

<p align="center">
  API REST desenvolvida com Java 17 e Spring Boot para gestão de candidatos e vagas.<br/>
  Projeto voltado à demonstração de boas práticas em backend, com foco em arquitetura limpa, versionamento profissional com Git (issues, branches, PRs) e organização de código para portfólio técnico.
</p>

---

### 🚀 Tecnologias Utilizadas

<p align="center">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" height="40" alt="Java" />
  &nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" height="40" alt="Spring Boot" />
  &nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/postgresql/postgresql-original.svg" height="40" alt="PostgreSQL" />
  &nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-original.svg" height="40" alt="Docker" />
  &nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/github/github-original.svg" height="40" alt="GitHub" />
  &nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/git/git-original.svg" height="40" alt="Git" />
  &nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/maven/maven-original.svg" height="40" alt="Maven" />
  &nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/junit/junit-original.svg" height="40" alt="JUnit" />
  &nbsp;
  <strong style="font-size: 16px;">Lombok</strong>
</p>

<p align="center">
  <strong>Java 17 • Spring Boot • JPA • Hibernate Validator • PostgreSQL • Lombok • Maven • Testes com JUnit & Mockito • Docker • Git/GitHub</strong><br/>
  <em>(🔜 Em breve: Integração Contínua com GitHub Actions)</em>
</p>

---

### 📚 Funcionalidades

- Cadastro de candidatos via requisição POST (`/candidates`)
- Organização de projeto com boas práticas (camadas, versionamento, semântica)
- Preparado para evoluir com banco de dados, autenticação, testes e CI/CD

---

### ⚙️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/gestao-vagas.git
   cd gestao-vagas
   ```

2. Execute com Maven:
   ```bash
   ./mvnw spring-boot:run
   ```

3. Teste o endpoint com o seguinte JSON:

   ```
   POST http://localhost:8080/candidates
   Content-Type: application/json

   {
     "name": "João Silva",
     "email": "joao@gmail.com",
     "phone": "11999999999"
   }
   ```

---

### 🗂️ Estrutura do Projeto

- 📦 `gestao-vagas/`
  - 📄 `banner-github.png`
  - 📄 `README.md`
  - ⚙️ `pom.xml`
  - 📁 `src/main/java/br/com/gestao/vagas/`
    - 📁 `controller/`
      - `CandidateController.java`
    - 📁 `entity/`
      - `CandidateEntity.java`


---

### 🧪 Testes

- Em breve será adicionada cobertura com `JUnit 5` e `Mockito`

---

### 📫 Contato

Desenvolvido por **Viviane Silva**  
<a href="https://github.com/seu-usuario" target="_blank">GitHub</a> |
<a href="https://www.linkedin.com/in/seu-linkedin" target="_blank">LinkedIn</a>

---
---

## 📘 Documentação Adicional

- [🧠 Diário Técnico (HELP.md)](./HELP.md): anotações, aprendizados, decisões técnicas e automações feitas ao longo do projeto.
