
# Learning Rules — Discipline and Effective Practice

These rules are mandatory for the learner and the learning agent.

## 1. The goal is independent capability

The purpose of every session is to increase what the learner can do without the agent. The agent is a coach and reviewer, not a substitute engineer.

## 2. Weekly commitment

Target: 6–8 focused hours.
- Weekday session: 45–60 minutes.
- Weekend project block: 2–3 hours.
- Weekly review: 30 minutes.
- At least one evening fully off.
- Do not trade sleep for study time.

Minimum viable week during busy periods: 4 focused hours. If this happens, reduce scope; do not pretend the original plan was completed.

## 3. One primary task at a time

At any moment:
- one current sprint;
- one primary task;
- one acceptance checklist.

Do not start a second feature or unrelated course while the current task is unfinished, unless the current task is explicitly blocked.

## 4. The 60-minute study loop

A standard session:

| Time | Activity |
|---:|---|
| 5 min | Recall previous lesson without notes |
| 10 min | Identify WHY the concept exists |
| 15 min | Study one focused explanation or official documentation section |
| 20 min | Implement or solve independently |
| 5 min | Test or verify |
| 5 min | Write a short summary and next question |

For longer project blocks, repeat the loop and take breaks.

## 5. Active recall before rereading

At the beginning of a session, answer:
- What did I learn last time?
- What problem does it solve?
- Can I explain it without notes?
- Can I produce a small example?

If unable, revisit the concept before adding new material.

## 6. Attempt-first rule

Before asking the agent for a solution:
1. restate the problem;
2. write assumptions;
3. attempt a solution for at least 15–20 minutes;
4. record the exact point of confusion;
5. ask for a hint, not the answer.

For a difficult concept, the learner may ask for a worked example, but must then complete a similar independent exercise.

## 7. Progressive hints

The agent should provide hints in this order:
- Hint 1: conceptual direction;
- Hint 2: possible approach;
- Hint 3: pseudocode or structure;
- Full solution: only after an attempt or explicit request.

The learner must not copy a full solution and call it mastery.

## 8. Definition of done

A task is complete only when:
- implementation or exercise is present;
- relevant tests/checks pass;
- important edge cases are considered;
- the learner can explain the result in their own words;
- the evidence is recorded.

A successful compile is not sufficient.

## 9. Notes should be concise

For each topic, capture:
- concept in 1–3 sentences;
- why it matters;
- one example;
- one common failure mode;
- one question still unclear.

Do not transcribe entire tutorials. Prefer small notes linked to code and tests.

## 10. Error journal

For meaningful mistakes, record:
- symptom;
- root cause;
- incorrect assumption;
- how it was diagnosed;
- fix;
- prevention.

Review the journal weekly. Repeated mistakes indicate a concept gap, not bad luck.

## 11. AI use policy

AI may be used to:
- explain unfamiliar concepts;
- generate quiz questions;
- critique a design;
- suggest test cases;
- review code;
- help diagnose an error.

AI must not:
- complete every exercise before the learner attempts it;
- invent evidence or progress;
- silently write a whole feature;
- replace reading errors, tests, or logs;
- encourage unreviewed dependency or security changes.

For every substantial AI-generated contribution, the learner must:
1. inspect the diff;
2. explain the design;
3. run relevant tests;
4. inspect edge cases and security implications;
5. record what was accepted or rejected and why.

## 12. Avoid tutorial hopping

Use one primary learning resource per topic where possible. Do not switch resources because a concept becomes difficult. First try:
1. reread the specific section;
2. build a minimal example;
3. ask a targeted question;
4. explain the concept back.

## 13. No fake productivity

The following do not count as completed work by themselves:
- watching videos;
- collecting links;
- copying code;
- asking the agent to generate a solution;
- reorganizing notes repeatedly;
- changing frameworks or project scope without a reason.

Count only focused practice and evidence.

## 14. Weekly review and recovery

Every week, answer:
- planned hours vs actual hours;
- completed artifacts;
- competencies assessed;
- biggest obstacle;
- one change for next week.

If behind schedule:
- Cut threshold: if actual focused hours are below 4 per week for two consecutive weeks, reduce that week's scope to its Critical items and extend the sprint by one week;
- identify whether task size, prerequisites, work demands, or study method caused it;
- reduce task size;
- preserve the sequence;
- do not double study hours automatically.

## 15. Professional integrity and privacy

Never commit:
- employer code or proprietary material;
- real customer or employee data;
- production database dumps;
- credentials, API keys, tokens, private keys;
- confidential screenshots or internal documents.

Use synthetic data and sanitized examples. Keep secrets in local environment files excluded by `.gitignore`.

## 16. Topic format (adopted 2026-11-20)

The learner asked for less hand-typed code and more focus on understanding, business context, and choosing the right solution. Each topic now uses four parts in about 45–60 minutes:

1. **Concept** (~25%): mechanism, system view, a banking example.
2. **Read and predict** (~25%): the agent provides code; the learner predicts several outputs in one batch, then runs it.
3. **Review flawed code** (~30%): the agent provides code with planted defects (the kind AI often generates); the learner finds and explains them.
4. **Choose a solution** (~20%): business scenarios; the learner chooses and justifies.

Hand-written code remains required where the competency is the code itself: fixing reviewed defects, Week 2 DSA problems, and timed exercises. Predict-then-run is kept because predictions expose misunderstandings (e.g. `null` vs `false`). One step per message still applies, but steps are larger and must teach something. Assessment rules do not change.
