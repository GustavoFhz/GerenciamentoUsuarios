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
   
2. cd nome-do-projeto
3. spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
4.mvn spring-boot:run

  📌 Rotas da API
Método	Rota	Descrição
GET	/usuarios	Lista todos usuários
GET	/usuarios/{id}	Obtém um usuário específico
POST	/usuarios	Cria um novo usuário
PUT	/usuarios/{id}	Atualiza um usuário existente
DELETE	/usuarios/{id}	Remove um usuário

