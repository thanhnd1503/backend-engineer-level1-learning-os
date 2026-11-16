
# CareerBank — Backend Engineering Practice Project

## Purpose

CareerBank is the primary project used to practice and demonstrate backend engineering fundamentals on the Backend Software Engineer Level I learning roadmap.

It is a learning project. It must never be represented as professional employment experience.

## Architecture

Start with a **modular monolith**. Keep modules separated by responsibility and avoid unnecessary microservices.

Suggested modules:
- identity/authentication;
- customer;
- account;
- transaction;
- shared infrastructure.

Use the existing project structure if it already exists. Do not restructure everything without a clear reason.

## Suggested technology baseline

- Java 21
- Spring Boot (use the version already established in the project unless a compatibility issue justifies a change)
- Maven
- MariaDB or PostgreSQL (use the existing database choice)
- Spring Data JPA where appropriate
- Spring Security
- JUnit and suitable Spring testing support
- Docker Compose

The agent must inspect the actual repository before assuming versions or dependencies.

## Functional scope

### Identity and access
- customer, teller, and admin roles;
- password hashing;
- login and logout behavior;
- access and refresh token lifecycle if JWT is used;
- authorization checks at the service/API boundary;
- no sensitive information in API responses or logs.

### Customer
- create and retrieve customer profile;
- validate input;
- protect personal fields;
- enforce access rules.

### Account
- create account;
- retrieve account details;
- represent status and balance safely;
- prevent unauthorized access.

### Transaction
- transfer between accounts;
- validate amount and account state;
- enforce sufficient balance;
- update both account balances atomically;
- prevent duplicate processing where applicable;
- consider concurrent transfers and lost updates;
- preserve an auditable transaction record.

## Engineering requirements

### API
- consistent request and response DTOs;
- validation;
- appropriate HTTP status codes;
- centralized exception handling;
- pagination for collection endpoints where relevant;
- clear API documentation.

### Database
- explicit transaction boundaries;
- constraints where appropriate;
- indexes based on query patterns;
- no N+1 surprises in important paths;
- explainable schema and relationships.

### Security
- least privilege;
- role-based authorization;
- password hashing, never plaintext;
- safe token handling;
- validate all untrusted input;
- avoid leaking secrets or personal data;
- never commit real credentials.

### Testing
- unit tests for business rules;
- integration tests for persistence and API behavior;
- negative tests for authorization and invalid input;
- transaction and concurrency tests for transfer logic where practical.

### Observability
- useful structured logs;
- health endpoint;
- avoid logging secrets, tokens, passwords, or sensitive personal data;
- basic metrics or a documented plan if metrics are not implemented.

### Delivery
- reproducible local setup;
- Docker Compose for application and database when appropriate;
- environment-based configuration;
- build and test instructions;
- CI pipeline if feasible within the roadmap.

## Non-goals for this preparation cycle

- no unnecessary microservices;
- no Kubernetes deployment requirement;
- no complex event-driven architecture unless needed for a specific lesson;
- no frontend requirement; `careerbank-fe`, if present, is outside this roadmap's scope and must not be extended;
- no real payment integration;
- no real customer data;
- no production deployment containing secrets.

## Required project documentation

As the project evolves, maintain:
- `README.md` — setup and run instructions;
- ERD or schema notes;
- API examples;
- architecture overview;
- key design decisions and trade-offs;
- test strategy;
- known limitations.

## Feature acceptance checklist

A feature is done only when:
- behavior matches the requirement;
- invalid input is handled;
- authorization is tested where applicable;
- persistence behavior is correct;
- relevant tests pass;
- logs do not expose sensitive data;
- the learner can explain the implementation;
- documentation is updated if behavior or setup changed.
