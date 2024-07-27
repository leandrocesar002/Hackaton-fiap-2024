<h1 align="center">TechChallenge Fiap - Restaurante</h1>

<p align="center">
  <a href="#-license">
    <img alt="License" src="https://img.shields.io/static/v1?label=license&message=MIT&color=ed2945&labelColor=000000">
  </a>
</p>

## Projeto

Projeto voltado para o fluxo de consulta de medico e paciente

## Tecnologia

Este projeto foi desenvolvido utilizando as seguintes tecnologias e conceitos:

- [Java](https://www.java.com/pt-BR/)
- [Docker](https://www.docker.com/)
- [DDD (Domain-driven Design)](https://domainlanguage.com/)
- [Hexagonal Architecture](<https://en.wikipedia.org/wiki/Hexagonal_architecture_(software)>)

## Banco de dados (DER/Postgres)
<div align="center">
  <img src="./paciente.jpeg" alt="paciente" />
</div>


## DDD (Domain-Driven Design)

<div align="center">
  <img src="./medico.jpg" alt="medico" />
</div>

### Dicionário Ubíquo

#### Medico:
- nome: O nome do medico.
- cpf: O número de CPF do medico.
- email: O endereço de e-mail do medico.
- crm: Carteira do medico.

#### Paciente:
- nome: O nome do paciente.
- cpf: O número de CPF do paciente.
- email: O endereço de e-mail do paciente.

#### Consulta
- status: O status da consulta.
- link: Link da consulta.
- duracao: Duração da consulta.

#### Agendamento
- status: O status da consulta.
- valor: o preço da consulta.


### Arquitetura 
<div align="center">
  <img src="./arq.jpeg" alt="Arquitetura" />
</div>

### Video de explicação

https://vimeo.com/907502067

## 📝 License

This project is licensed under the MIT License. For more information, please refer to the [LICENSE](LICENSE.md) file.
