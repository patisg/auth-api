# Auth API

API REST de autenticação desenvolvida para estudo e prática de segurança em aplicações backend.

## Sobre o projeto

API de autenticação com cadastro e login de usuários utilizando tokens JWT. As rotas protegidas só podem ser acessadas com um token válido no header da requisição.
O projeto também conta com testes de integração utilizando JUnit e MockMvc para validar os principais fluxos da aplicação, como cadastro de usuário, login e acesso a endpoints protegidos.

## Funcionalidades

- Cadastro de usuários com senha criptografada
- Login com geração de token JWT
- Endpoint protegido que retorna os dados do usuário autenticado

## Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Security
- JWT
- PostgreSQL
- JUnit
