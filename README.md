
# Backend Engineer Level I — Learning OS

> A disciplined, evidence-based learning system to build Backend Software Engineer Level I fundamentals.

## Mission

Build the skills required for Backend Software Engineer Level I, then use structured feedback and a strong engineering environment to continue growing.

This repository is a learning system, not a collection of notes. Every topic must lead to an observable result: code, tests, technical explanation, design document, debugging evidence, or an assessment result.

## Non-negotiable principles

1. **Understand before implementing.** Learn the WHY, then the HOW.
2. **Practice before consuming more content.** Reading and watching do not count as completion.
3. **The learner writes the solution.** The agent coaches, reviews, questions, and verifies; it must not silently do the work.
4. **Evidence over confidence.** A topic is complete only when its acceptance criteria are demonstrated.
5. **No skipping gates.** Do not move to the next phase while critical prerequisites are below the required level.
6. **Quality over feature count.** Correctness, tests, readability, security, and reasoning matter more than lines of code.
7. **Use AI responsibly.** The learner must understand, validate, and own every accepted AI-generated change.
8. **Protect confidential information.** Never place employer source code, customer data, credentials, tokens, internal documents, or production data in this repository or external AI tools.

## Target

- Role: Backend Software Engineer — Level I
- Preparation horizon: 10 weeks, adaptive rather than blindly calendar-driven
- Weekly study capacity: approximately 6–8 focused hours
- Main project: CareerBank, a Java/Spring Boot backend learning project

The 10-week schedule is an optimistic baseline. The realistic estimate is 10–12 weeks at 6–8 hours per week. If an assessment exposes a real gap, repeat or extend the relevant sprint instead of pretending the milestone is complete.

## Repository map

| File | Purpose |
|---|---|
| `CLAUDE.md` | Primary operating contract for Claude-compatible coding agents |
| `AGENTS.md` | General operating contract for coding agents |
| `ROADMAP_10_WEEKS.md` | Sequenced learning roadmap and deliverables |
| `TARGET_ROLE_REQUIREMENTS.md` | Role requirements translated into observable competencies |
| `LEARNING_RULES.md` | Discipline, study method, and anti-shortcut rules |
| `ASSESSMENT_RUBRIC.md` | Pass / Partial / Fail criteria and assessment protocol |
| `CAREERBANK_PROJECT.md` | Project scope and engineering constraints |
| `SPRINT_01.md` | First sprint: baseline assessment and Java foundations |
| `WEEKLY_REVIEW_TEMPLATE.md` | Weekly review template |
| `PROGRESS.md` | Single source of truth for progress |

## How to start

1. Read `CLAUDE.md` or `AGENTS.md`.
2. Read `LEARNING_RULES.md`.
3. Read `TARGET_ROLE_REQUIREMENTS.md`.
4. Complete the baseline tasks in `SPRINT_01.md`.
5. Record results in `PROGRESS.md`.
6. Do not start a new sprint until the current sprint's gate is assessed.

## How to work with an agent

At the start of a session, ask the agent:

> Read the project instructions and current progress. Tell me the current sprint, its objective, the next single task, and its acceptance criteria. Do not implement anything until I attempt the task or explicitly request a demonstration.

At the end of a session, ask:

> Review only the work completed in this session. Test it where possible, identify gaps, assess my understanding with questions, and propose the next smallest task. Update progress only when there is evidence.

## Progress policy

`PROGRESS.md` is the source of truth. The agent may suggest updates, but it must not mark a competency as Pass without:
- a concrete artifact or practical demonstration;
- a test, explanation, or review appropriate to the competency;
- evidence that the learner can explain the solution without relying on the agent.

## Important

Expectations for the role can change. Periodically compare this repository's target matrix with current, verifiable sources. Do not invent requirements or outcomes.
