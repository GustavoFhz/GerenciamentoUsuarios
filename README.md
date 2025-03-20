# CRUD de Gerenciamento de Usuários

Este é um projeto de CRUD (Create, Read, Update, Delete) para gerenciamento de usuários, desenvolvido em Java.

## 🛠 Tecnologias utilizadas
- Java
- Spring Boot
- Hibernate (JPA)
- MySQL 
- IntelliJ IDEA (ou outra IDE)
- Postman (para testes)

## 🚀 Funcionalidades
- Criar usuário
- Listar usuários
- Atualizar informações de usuários
- Excluir usuário

## ⚙️ Configuração do projeto
1. Clone este repositório:
   ```sh
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ``sh
2. cd nome-do-projeto
```sh
3. spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
``sh
4.mvn spring-boot:run

## 📌 Rotas da API

- **GET** `/usuarios`  
  Lista todos os usuários.

- **GET** `/usuarios/{id}`  
  Obtém um usuário específico pelo ID.

- **POST** `/usuarios`  
  Cria um novo usuário.

- **PUT** `/usuarios/{id}`  
  Atualiza um usuário existente pelo ID.

- **DELETE** `/usuarios/{id}`  
  Remove um usuário pelo ID.


