
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
- Overall status: In progress — Week 1 extended by one week (Module 0 added)
- Last review date: 2026-11-17 (Week 1)
- Planned weekly capacity: 6–8 focused hours

## Competency tracker

| Competency | Status | Evidence | Last assessed | Next action |
|---|---|---|---|---|
| Java OOP | Pass | exercises/week1/ (IShape, Circle, Rectangle, TotalCalculator, Main): polymorphic totalArea over List<IShape> with no instanceof; explained runtime dispatch and that abstract classes dispatch the same way; constructor validation rejects <= 0 and NaN (first version allowed 0 and NaN; fixed after review; boundary cases verified by an agent-written probe, not by the learner); explained validating in the constructor so every object is valid and checks are not repeated in each method. Infinity is still accepted (low priority) | 2026-11-16 | Collections: array vs List |
| Java build and execution (Module 0, step 1) | Pass | exercises/week1/: stale-.class experiment (edited Main.java without recompiling; `java Main` loaded old classes from `.`, `java -cp build Main` loaded new ones); learner explained .class, recompilation, and classpath; explained that code using Java 25 features can fail to build on a Java 21 server. Needed a hint to distinguish `which java` (binary path) from `java -version` (version) | 2026-11-12 | Module 0, step 2: reading compile-time vs runtime errors |
| Reading compile-time and runtime errors (Module 0, step 2) | Pass | exercises/week1/: triggered missing import (javac, TotalCalculator.java:3), `new Circle(-1)` (runtime IllegalArgumentException, read stack trace Circle.java:6 ← Main.java:6), misspelled main class (ClassNotFoundException, no user frames). Initially said the missing-import error happened in the JRE; corrected after feedback and then independently explained that a failed javac leaves the previous .class files in place | 2026-11-12 | Placement test for Module 0 steps 3–7 |
| Module 0 placement, steps 3–7 | Pass for steps 3, 4, 5, 7; step 6 (String) Pass — 2026-11-16, exercises/module0/step6/: predicted `==`/`equals()` correctly and explained reference vs content comparison and the String pool (15 min); `isPalindrome` two-pointer loop, first version was case-sensitive and tested on self-chosen cases only; after review fixed with `toLowerCase()`, tested the required cases ("Level" true, "abc" false, "" true; verified by agent run) and explained why "" is a palindrome. Module 0 gate met | exercises/module0/placement/ (Scores.java, Main.java): 20 minutes; hand-computed 6.333…, 4, "Trung binh" matched output; avoided integer division with `(double) sum / length`; explained throwing on an empty array as "no meaningful average". Review notes: countPassed throws on empty input (0 would be natural), individual scores not range-checked, 0/10 repeated as magic numbers. Needed help with packages and classpath when running; then independently wrote `java -cp out com.careerbank.App` for a new package/classpath case | 2026-11-16 | Module 0 complete; continue with Week 1 (Shape validation) |
| Java Collections | Partial (lessons 1–3 of List/Set/Map/Queue done) | Lesson 3 (Map), exercises/week1/collections/MapDemo.java (2026-11-19): counted logins per email with HashMap<String, Integer> (containsKey/get/put, correct without help); predicted counts correctly but expected array-like format and insertion order, then explained both differences after running; predicted false or 0 for get on a missing key (actual null); predicted runtime error for `int n = get(missing)` correctly, read NullPointerException message and line, but quoted the message without the exception name; explained javac cannot know runtime values. First fix used `if (containsKey) n = 1` (logic bug: a@x.com gave 1, not 3); learner predicted the wrong result once prompted, then fixed with getOrDefault. Recall needed a narrow follow-up to explain null + implicit intValue() unboxing. Run command written from memory: `java -cp build collections.MapDemo` (first attempt used folder path as class name; fixed after one hint). Lesson 2 (Set), exercises/week1/collections/SetDemo.java (2026-11-17): wrote predictions before running; add returned true/true/false as predicted; observed HashSet vs LinkedHashSet order; timed List vs Set contains over 1M items (predicted 1,000,000x, measured ~600–700x). Answered that equals() (not hashCode()) confirms a duplicate; chose Set<String> for registered emails. First explanation cited resize instead of lookup cost; after a hint explained List compares item by item while HashSet jumps to the bucket via the hash. Did not state the growth explicitly (1,000 → 1,000,000 users means 1000x more comparisons for List). Depth agreed with learner: concept level only (no bit masks, load-factor constants, JIT timing). Lesson 1, exercises/week1/collections/ListVsArray.java (2026-11-17): predicted arr[3] fails at runtime, not compile time; ran and read ArrayIndexOutOfBoundsException (ListVsArray.java:9); ArrayList size/add/add(index) output correct. Predictions for parts 2–3 not written down before running. Needed a hint to explain why javac cannot catch index errors (values only known at runtime); described ArrayList growth but omitted copying old elements until corrected. Package/classpath: still mixed folder paths and package names in the run command (3 attempts) | 2026-11-19 | Lesson 4: Queue (FIFO, ArrayDeque) |
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
- Status: Done (2026-11-12)
- Evidence: Learning OS created and revised; CareerBank code deleted to restart from zero.

### Week 1 — 2026-11-12 to 2026-11-17 (review 2026-11-17)
- Time: planned 7 h; actual ~8 h, self-reported (4 sessions of ~2 h). Fewer, longer sessions than the planned 5 weekday sessions.
- Completed: Module 0 (steps 1–2, placement for steps 3–7, String check) — Pass; Java OOP (Shape exercise with validation) — Pass; repo moved to root and pushed.
- Not completed: rest of Week 1 topics (Collections, Generics, Exceptions, equals/hashCode, immutability, Streams). Cause: Module 0 was added mid-week, not low effort.
- Biggest obstacle (learner): building and running from the terminal — did not remember `javac -d build ...` and the `java -cp` form at first.
- AI usage: ChatGPT used to explain some side theory; no exercise code reported as AI-generated.
- Coaching feedback: current teaching style works; learner keeps the main points.
- Adjustment for next week: start each session with a 2-minute recall — write the compile and run commands for the current exercise from memory before looking anything up.
- Plan change: Week 1 extended by one week; overall estimate moves toward 11–12 weeks.

## Current blockers

- None recorded yet.

## Next single task

Week 1, Collections lesson 4: Queue (FIFO, ArrayDeque, offer/poll/peek, poll on empty queue returns null). Taught one step per message.

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
