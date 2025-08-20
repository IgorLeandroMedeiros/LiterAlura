# LiterAlura - Catálogo de Livros e Autores

Projeto Java com Spring Boot que consome a API Gutendex para gerenciar livros e autores.

---

## Características do Projeto

- Buscar livros por título
- Listar todos os livros
- Listar autores
- Filtrar autores vivos em determinado ano
- Filtrar livros por idioma
- Persistência em banco de dados PostgreSQL
- Integração com API externa (Gutendex)
- Spring Boot + Spring Data JPA + Jackson

---

## Estrutura do Projeto

- `entity` – Classes de modelo Livro e Autor
- `repository` – Repositórios Spring Data JPA
- `service` – Lógica de negócio e manipulação de dados
- `controller` – Endpoints REST
- `data loader` – Popula o banco de dados inicial

---

## Tecnologias Utilizadas

- Java 24
- Spring Boot 3.4.8
- Spring Data JPA
- PostgreSQL
- Jackson (JSON parsing)
- Maven

---

## Configuração

1. Instale e configure o PostgreSQL.
2. Configure usuário e senha no `application.properties`.
3. Rode o projeto com:
```bash
mvn spring-boot:run
