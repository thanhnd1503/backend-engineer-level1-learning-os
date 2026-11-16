
# Learning Progress — Source of Truth

> Update only with evidence. Do not mark a competency Pass based on reading, watching, copying, or agent-generated output alone.

## Current status

- Target: Backend Software Engineer Level I
- Roadmap: 10–12 weeks (estimate), competency-gated
- Hour budget: see ROADMAP_10_WEEKS.md, "Hour budget per week"
- CareerBank code: deleted from working tree on 2026-11-12 at the learner's request (careerbank-be and careerbank-fe). Restart from zero. Last committed state is recoverable from git commit d65c15a in /home/otis/Desktop/CareerBank.
- Exercise folder: exercises/ inside this repo, created when Sprint 01 Step 2 starts
- Cut threshold: see LEARNING_RULES.md section 14
- Current sprint: Sprint 01 — Baseline Assessment and Java Foundations
- Current phase: Phase 1 — Java Core and Computer Science
- Overall status: Not assessed
- Last review date: Not started
- Planned weekly capacity: 6–8 focused hours

## Competency tracker

| Competency | Status | Evidence | Last assessed | Next action |
|---|---|---|---|---|
| Java OOP | Pass | exercises/week1/ (IShape, Circle, Rectangle, TotalCalculator, Main): polymorphic totalArea over List<IShape> with no instanceof; explained runtime dispatch and that abstract classes dispatch the same way; constructor validation rejects <= 0 and NaN (first version allowed 0 and NaN; fixed after review; boundary cases verified by an agent-written probe, not by the learner); explained validating in the constructor so every object is valid and checks are not repeated in each method. Infinity is still accepted (low priority) | 2026-11-16 | Collections: array vs List |
| Java build and execution (Module 0, step 1) | Pass | exercises/week1/: stale-.class experiment (edited Main.java without recompiling; `java Main` loaded old classes from `.`, `java -cp build Main` loaded new ones); learner explained .class, recompilation, and classpath; explained that code using Java 25 features can fail to build on a Java 21 server. Needed a hint to distinguish `which java` (binary path) from `java -version` (version) | 2026-11-12 | Module 0, step 2: reading compile-time vs runtime errors |
| Reading compile-time and runtime errors (Module 0, step 2) | Pass | exercises/week1/: triggered missing import (javac, TotalCalculator.java:3), `new Circle(-1)` (runtime IllegalArgumentException, read stack trace Circle.java:6 ← Main.java:6), misspelled main class (ClassNotFoundException, no user frames). Initially said the missing-import error happened in the JRE; corrected after feedback and then independently explained that a failed javac leaves the previous .class files in place | 2026-11-12 | Placement test for Module 0 steps 3–7 |
| Module 0 placement, steps 3–7 | Pass for steps 3, 4, 5, 7; step 6 (String) Pass — 2026-11-16, exercises/module0/step6/: predicted `==`/`equals()` correctly and explained reference vs content comparison and the String pool (15 min); `isPalindrome` two-pointer loop, first version was case-sensitive and tested on self-chosen cases only; after review fixed with `toLowerCase()`, tested the required cases ("Level" true, "abc" false, "" true; verified by agent run) and explained why "" is a palindrome. Module 0 gate met | exercises/module0/placement/ (Scores.java, Main.java): 20 minutes; hand-computed 6.333…, 4, "Trung binh" matched output; avoided integer division with `(double) sum / length`; explained throwing on an empty array as "no meaningful average". Review notes: countPassed throws on empty input (0 would be natural), individual scores not range-checked, 0/10 repeated as magic numbers. Needed help with packages and classpath when running; then independently wrote `java -cp out com.careerbank.App` for a new package/classpath case | 2026-11-16 | Module 0 complete; continue with Week 1 (Shape validation) |
| Java Collections | Not assessed | — | — | Lesson 1: array vs List (why totalArea takes List<IShape>) |
| Generics and Exceptions | Not assessed | — | — | Baseline diagnostic |
| equals/hashCode and immutability | Not assessed | — | — | Baseline diagnostic |
| Data Structures and Algorithms | Not assessed | — | — | Baseline diagnostic |
| Big-O reasoning | Not assessed | — | — | Complexity exercises |
| Spring Boot fundamentals | Not assessed | — | — | Inspect CareerBank |
| REST API design | Not assessed | — | — | Inspect CareerBank |
| Authentication and Authorization | Not assessed | — | — | Inspect CareerBank |
| SQL and query plans | Not assessed | — | — | Practical assessment |
| Transactions and isolation | Not assessed | — | — | Practical assessment |
| Concurrency | Not assessed | — | — | Practical assessment |
| Validation and error handling | Not assessed | — | — | Week 3 API work |
| Debugging | Not assessed | — | — | Debugging case study |
| Code quality and review | Not assessed | — | — | PR-style review |
| System design | Not assessed | — | — | Design note |
| Collaboration | Not assessed | — | — | Simulated review exercise |
| Unit and Integration Testing | Not assessed | — | — | Inspect tests |
| Linux and Networking | Not assessed | — | — | Baseline assessment |
| Docker and delivery | Not assessed | — | — | Inspect environment |
| Observability | Not assessed | — | — | Later sprint |
| AI-assisted engineering | Not assessed | — | — | AI work log |
| Technical communication | Not assessed | — | — | Explanation exercise |

## Weekly log

### Week 0 — Setup
- Status: Not started
- Evidence:
- Notes:

## Current blockers

- None recorded yet.

## Next single task

Week 1, Collections lesson 1: array vs List. Learner first reasons about why `totalArea` takes `List<IShape>` instead of `IShape[]` (size, adding elements, API), then the agent teaches WHY and the mental model.

## CV evidence bank

Only add verified items. Separate professional experience from learning-project experience.

| Claim / achievement | Type (Professional / Learning project) | Evidence | Safe CV wording |
|---|---|---|---|
| Backend API development | Professional | To be documented | Pending review |
| SQL optimization | Professional | To be documented | Pending review |
| Authentication / SSO / RBAC | Professional | To be documented | Pending review |
| Legacy application migration | Professional | To be documented | Pending review |
| CareerBank Java/Spring Boot | Learning project | Not assessed | Do not add until demonstrated |

## Change log

- 2026-11-12: Initial Learning OS created. No competencies assessed yet.
