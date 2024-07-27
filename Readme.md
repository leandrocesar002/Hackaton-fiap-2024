<h1 align="center">Hackaton Fiap - Telemedicina</h1>

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

## Diagrama
<div align="center">
  <img src="./paciente.jpeg" alt="paciente" />
</div>

## Banco de dados
<div align="center">
  <img src="./banco.jpeg" alt="banco" />
</div>


## DDD (Domain-Driven Design)

<div align="center">
  <img src="./medico.jpeg" alt="medico" />
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


#### Requisitos não funcionais

- Disponibilidade: está na aws funcionando 24h.

- Escalabilidade: tem loadbalancer gerenciando a aplicação.

- Autenticação spring Security utilizando bearer token.


### Arquitetura 
<div align="center">
  <img src="./arq.jpeg" alt="Arquitetura" />
</div>

### Video de explicação
- Demonstração dos itens de 1 a 6 e disponibilidade na nuvem
https://vimeo.com/990827760

- Demonstração de infra e as pipelines
https://vimeo.com/990828606

## 📝 License

This project is licensed under the MIT License. For more information, please refer to the [LICENSE](LICENSE.md) file.
