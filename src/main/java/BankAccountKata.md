# Bank account kata

Think of your personal bank account experience.
When in doubt, go for the simplest solution.

## Business Requirements

- Deposit and Withdrawal on your account.
- Transfer between accounts.
- Account statement (date, amount, balance).
- Statement printing.
- Statement filters (just deposits, withdrawals, date).

## Technical Requirements

- Create an HTTP server (preferred) or a library. GUI is not needed.
- Choose a programming language in which you are confident; it should not be an extra difficulty.
- Try not to use frameworks.
- Write code using TDD practice.
- Don't worry about where you save the data... **this is just a kata!** so it is acceptable not to have persistence and
  temporarily store the data in memory e.g. using an array.

## The Rules

Try telling stories. The end user is the primary protagonist of your stories.

Approach the kata by performing the following points in sequence:
1. Write some _"user stories"_.
2. Create one or more _"test scenarios"_ based on your story in the form of **Given-When-Then**.
3. Implement **only one** _"Customer Test (E2E)"_ based on one of the _"test scenarios"_ previously defined.
4. **Optionally:** implement one or more _"API Tests"_ for the GUI developers (use TDD, so implement one test at a
   time).
   Consider the GUI developers as the final user and try to describe, with some tests, how they should use your APIs.
5. Start writing code from outside.
6. Write _"Unit Test"_ when needed.
7. Release value!

## Credits

- Original idea for the kata: How Object-Oriented Are You Feeling Today? - Krzysztof Jelski (Session on the Software
  Craftsmanship UK 2011 conference)
- [codurance - Bank Kata](https://www.codurance.com/katas/bank) inspiring me!
