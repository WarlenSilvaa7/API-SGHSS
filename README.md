🏥 Sistema de Gestão Hospitalar e de Serviços de Saúde (SGHSS)
Este projeto é um sistema web desenvolvido para facilitar o gerenciamento de clínicas e consultórios médicos. Ele oferece funcionalidades como cadastro de pacientes, profissionais, agendamento de consultas, autenticação via JWT e proteção com Spring Security.

O sistema foi construído como parte do Trabalho Final do curso de Análise e Desenvolvimento de Sistemas, com foco em:

Desenvolvimento de APIs RESTful com Spring Boot

Autenticação segura com JWT

Gerenciamento de banco de dados com JPA/H2

Estrutura organizada seguindo boas práticas de desenvolvimento

📌 Tabela de Endpoints da API SGHSS

| Entidade          | Método | Endpoint              | Descrição              |
| ----------------- | ------ | --------------------- | ---------------------- |
| **Consultas**     | GET    | `api/consultas`          | Listar Consultas       |
|                   | POST   | `api/consultas`          | Criar Consulta         |
|                   | DELETE | `api/consultas/{id}`     | Excluir Consulta       |
|                   | PUT    | `api/consultas/{id}`     | Atualizar Consulta     |
| **Exames**        | GET    | `api/exames`             | Listar Exames          |
|                   | POST   | `api/exames`             | Criar Exame            |
|                   | DELETE | `api/exames/{id}`        | Excluir Exame          |
|                   | PUT    | `api/exames/{id}`        | Atualizar Exame        |
| **Pacientes**     | GET    | `api/pacientes`          | Listar Pacientes       |
|                   | POST   | `api/pacientes`          | Criar Paciente         |
|                   | DELETE | `api/pacientes/{id}`     | Excluir Paciente       |
|                   | PUT    | `api/pacientes/{id}`     | Atualizar Paciente     |
| **Prescrições**   | GET    | `api/prescricoes`        | Listar Prescrições     |
|                   | POST   | `api/prescricoes`        | Criar Prescrição       |
|                   | DELETE | `api/prescricoes/{id}`   | Excluir Prescrição     |
|                   | PUT    | `api/prescricoes/{id}`   | Atualizar Prescrição   |
| **Profissionais** | GET    | `api/profissionais`      | Listar Profissionais   |
|                   | POST   | `api/profissionais`      | Criar Profissional     |
|                   | DELETE | `api/profissionais/{id}` | Excluir Profissional   |
|                   | PUT    | `api/profissionais/{id}` | Atualizar Profissional |
| **Usuários**      | POST   | `api/auth/register`      | Registrar Usuário      |
|                   | POST   | `api/auth/login`         | Login do Usuário       |
