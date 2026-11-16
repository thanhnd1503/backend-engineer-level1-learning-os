
# 10-Week Roadmap — Backend Software Engineer Level I

## Outcome

At the end of the plan, the learner should be able to:
- demonstrate Java programming fundamentals;
- build and explain a Spring Boot REST API;
- reason about relational databases, transactions, and concurrency;
- write useful unit and integration tests;
- understand core networking, Linux, containers, and delivery workflow;
- discuss small backend designs and engineering trade-offs;
- use AI-assisted development safely and critically;
- present real work honestly in an updated CV.

The roadmap is competency-gated. Ten weeks is the optimistic baseline. The realistic estimate is 10–12 weeks at 6–8 focused hours per week. Neither is permission to skip unfinished fundamentals.

## Weekly capacity

Target: 6–8 focused hours per week (5 weekday sessions of 45–60 minutes = 3.75–5 h, plus one weekend block of 2–3 h).
- Weekdays: 45–60 minutes per session.
- Weekend: one 2–3 hour implementation block.
- At least one recovery/rest evening.
- If work or life becomes busy, protect a 4-hour minimum rather than sacrificing sleep.

Schedule flex: Week 4 (persistence and security) and Week 8 (delivery and observability) are the densest weeks. Each may be extended by one week if its gate is not met. The roadmap is then 10–12 weeks, per the competency-gate rule.

Hour budget per week (planning estimates, re-checked at each weekly review):

| Week | Budget (h) | Week | Budget (h) |
|---|---:|---|---:|
| 1 | 7 | 6 | 7 |
| 2 | 7 | 7 | 6 |
| 3 | 7 | 8 | 7 |
| 4 | 8 | 9 | 6 |
| 5 | 7 | 10 | 6 |

Total: 68 hours. If a week's budget is not realistic, adjust the task size rather than adding hours.

## Module 0 — Foundations from zero (first part of Week 1, before any OOP)

Each step ends with a small program the learner writes and explains in their own words. Do not move to the next step until the current one passes.

1. How a Java program runs: source → `javac` → bytecode (`.class`) → `java` / JVM → `main`.
2. Terminal basics: `cd`, `ls`, relative and absolute paths, reading compiler and runtime errors.
3. Variables, primitive types (`int`, `double`, `boolean`), expressions, integer division, floating-point precision.
4. Conditionals and loops (`if`, `for`, `while`).
5. Methods: parameters, return values, scope.
6. Arrays and `String` basics.
7. Classes and objects: fields, constructors, `this`.
8. Return to Week 1 topics: interfaces and polymorphism (the `Shape` exercise), then collections.

Gate for Module 0: the learner can write each step's program without help and explain what the compiler and JVM do with it.

Placement rule: steps 3–7 may be skipped if the learner passes a 30-minute, no-notes placement test covering them. Any step the test exposes as weak is studied individually.

Because Module 0 adds time, the Week 1 budget and the 10–12 week estimate may need adjustment at the first weekly review.

## Phase 1 — Java Core and Computer Science (Weeks 1–2)

### Week 1: Java foundations

Topics:
- syntax, types, control flow, methods;
- classes, interfaces, encapsulation, inheritance, polymorphism;
- exceptions and resource handling;
- Collections: List, Set, Map, Queue;
- equals/hashCode, immutability, Generics;
- basic Stream API.

Deliverables:
- small Java console application;
- collection-focused exercises;
- short explanations of OOP, equality, immutability, and exception handling.

Gate:
- independently model a small domain;
- select appropriate collections and explain why;
- handle invalid input and exceptions;
- explain equals/hashCode and basic object lifecycle.

### Week 2: DSA and programming reasoning

Topics:
- Big-O;
- arrays and strings;
- HashMap and HashSet;
- stack and queue;
- sorting and binary search;
- basic recursion and tree traversal if fundamentals are stable.

Deliverables:
- 15–20 appropriately scoped problems;
- written complexity analysis for selected solutions;
- one timed independent problem-solving session.

Gate:
- solve common easy-level problems independently;
- explain time and space complexity;
- identify edge cases before coding.

## Phase 2 — Spring Boot and Backend Fundamentals (Weeks 3–4)

### Week 3: Spring Boot foundations

Topics:
- project structure and build lifecycle;
- Dependency Injection and IoC;
- Controller, Service, Repository responsibilities;
- REST semantics and HTTP status codes;
- request validation;
- exception handling;
- configuration and environment variables;
- logging.

Deliverables:
- REST CRUD module;
- request/response examples;
- centralized error handling;
- basic API documentation.

Gate:
- build and explain a layered REST API;
- validate input and return consistent errors;
- explain dependency injection and HTTP semantics.

### Week 4: Persistence and application security

Topics:
- relational mapping and JPA/Hibernate fundamentals;
- entity lifecycle and transaction boundaries;
- DTOs and mapping;
- authentication versus authorization;
- password hashing;
- JWT access and refresh token concepts;
- role-based access control;
- common API security risks.

Deliverables:
- CareerBank authentication and authorization flow;
- persistence layer;
- tests for access-control rules.

Gate:
- explain authentication and authorization separately;
- protect endpoints by role;
- avoid returning sensitive fields;
- explain token lifecycle and major security trade-offs.

## Phase 3 — Database, Concurrency, and Quality (Weeks 5–6)

### Week 5: SQL and transaction correctness

Topics:
- indexes and query plans;
- joins and query selectivity;
- ACID;
- isolation levels;
- locks, deadlocks, optimistic and pessimistic locking;
- pagination and large-result processing.

Deliverables:
- analyze one slow query using a reproducible dataset;
- document query-plan observations;
- implement a transaction-sensitive use case.

Gate:
- explain why an index may or may not help;
- identify transaction boundaries;
- explain lost updates and a suitable prevention strategy;
- discuss consistency/performance trade-offs.

### Week 6: Concurrency and testing

Topics:
- race conditions;
- thread safety and shared mutable state;
- transaction concurrency;
- unit testing;
- integration testing;
- mocking and test boundaries;
- edge cases and regression testing.

Deliverables:
- tests for critical business logic;
- integration tests for persistence/API behavior;
- concurrent request test or reproducible concurrency demonstration;
- short test strategy note.

Gate:
- explain what each test protects;
- demonstrate a failure before a fix where practical;
- avoid tests that merely mirror implementation details.

## Phase 4 — Infrastructure and Engineering Workflow (Weeks 7–8)

### Week 7: Linux, networking, and Docker

Topics:
- processes, memory, CPU, file descriptors, logs;
- DNS, TCP, HTTP/HTTPS, TLS at conceptual level;
- Docker image/container/volume/network;
- Docker Compose;
- application configuration and health checks.

Deliverables:
- run application and database using Docker Compose;
- document service startup and connectivity;
- diagnose one deliberately introduced configuration/network issue.

Gate:
- explain request path from client to application to database;
- distinguish image, container, volume, and network;
- diagnose basic process, port, DNS, and log issues.

### Week 8: Delivery and observability

Topics:
- CI pipeline concepts;
- build, test, package stages;
- environment separation;
- structured logs;
- metrics and health checks;
- cache, message queue, retry, idempotency at introductory level.

Deliverables:
- simple CI workflow if repository hosting supports it;
- health endpoint;
- useful structured logging;
- design note explaining retry and idempotency for one operation.

Gate:
- explain the delivery pipeline;
- distinguish logs, metrics, and traces;
- explain why retries can create duplicate side effects and how idempotency helps.

## Phase 5 — AI-assisted Engineering and Communication (Week 9)

Topics:
- task decomposition and prompt quality;
- reviewing generated code;
- validating assumptions;
- test generation and test review;
- security and dependency review;
- explaining technical decisions in English;
- code review and constructive feedback.

Deliverables:
- one feature developed with documented AI assistance;
- record AI suggestions accepted/rejected and why;
- test evidence;
- one concise technical explanation in English.

Gate:
- identify at least one weakness or assumption in AI output;
- independently explain the final implementation;
- demonstrate validation beyond "it compiles".

## Phase 6 — Final Assessment and CV Review (Week 10)

Activities:
- Java and DSA assessment;
- Spring Boot code review;
- database/concurrency questions;
- small backend design exercise;
- English technical explanation;
- project walkthrough;
- target-role requirement matrix review;
- CV review and update.

Deliverables:
- completed assessment sheet;
- updated `PROGRESS.md`;
- updated CV draft;
- evidence-backed skills inventory;
- remaining-gap list and next learning plan.

Final gate:
- all critical Level I fundamentals are Pass or have a documented, bounded remediation plan;
- no CV claim exceeds demonstrated ability;
- the learner can explain CareerBank without agent assistance.

## Priority if time becomes limited

Do not cut in this order. Items 1–6 are Critical in TARGET_ROLE_REQUIREMENTS.md, item 8 is High, and items 7 and 9 are Medium:
1. Java fundamentals;
2. backend API and Spring;
3. database and transaction correctness;
4. testing and debugging;
5. DSA fundamentals;
6. security;
7. Linux/networking/Docker basics;
8. AI workflow and communication;
9. introductory cache/queue/observability.

Advanced Kubernetes, complex microservices, and deep cloud architecture remain out of scope for this preparation cycle.

## Weekly review

Use `WEEKLY_REVIEW_TEMPLATE.md` every week. Update `PROGRESS.md` only with evidence.
