
# Sprint 01 — Baseline Assessment and Java Foundations

## Objective

Establish the learner's real starting point, then strengthen Java fundamentals without assuming that previous learning is either mastered or forgotten.

Do not begin by rebuilding CareerBank. First inspect its current state.

## Step 0 — Repository and environment audit

The learner or agent should record:
- current CareerBank directory and Git status;
- Java version;
- Maven version;
- Spring Boot version;
- database and version;
- current modules and implemented features;
- existing tests and latest test result.

Do not print secrets or copy environment files into the repository.

## Step 1 — Baseline diagnostic

The agent should administer a short diagnostic without showing solutions first.

### Java questions
1. Explain the difference between an interface and an abstract class.
2. Explain encapsulation and polymorphism with an example.
3. Why must `equals()` and `hashCode()` be consistent?
4. When would you use `List`, `Set`, and `Map`?
5. What problem do generics solve?
6. What is the difference between checked and unchecked exceptions?
7. What makes an object immutable?
8. What is the purpose of Stream API, and when would a normal loop be clearer?

### Coding exercises
1. Count word frequencies using a Map.
2. Remove duplicates while preserving insertion order.
3. Validate balanced brackets using a Stack.
4. Find the first non-repeating character in a string.
5. Explain the time and space complexity of two solutions.

The agent should select a reasonable subset for the first session, then adapt based on results. Do not overwhelm the learner with all exercises at once.

## Step 2 — Java implementation task

Build a small domain model unrelated to the banking project first, such as a simple inventory item or task tracker.

Acceptance criteria:
- use encapsulation;
- choose appropriate collections;
- validate invalid state;
- use exceptions intentionally;
- include a few unit tests if the current setup supports them;
- explain the design in the learner's own words.

The agent should not generate the complete solution before the learner attempts it.

## Step 3 — DSA practice

Complete a small set of array, string, and HashMap problems.

For each problem, write:
- input/output examples;
- edge cases;
- initial approach;
- final approach;
- time complexity;
- space complexity.

## Sprint 01 exit gate

The learner can:
- explain core OOP concepts;
- choose common Java collections appropriately;
- explain equals/hashCode and immutability;
- solve basic collection/string problems independently;
- explain complexity at a basic level;
- run the project and tests in the local environment.

If any critical item is Partial or Fail, create a remediation task before moving on.

## Required updates

At the end of Sprint 01:
- update `PROGRESS.md`;
- record evidence links or file paths;
- record assessment status;
- list unresolved questions;
- propose the next sprint only after the gate review.
