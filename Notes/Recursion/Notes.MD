# Recursion in Java

## What is Recursion?
Recursion is a programming technique where a method calls itself in order to solve a problem by breaking it down into smaller subproblems of the same type.

In Java, recursion is useful when a problem has:
- a repetitive structure
- a hierarchical nature
- a clear stopping condition

---

## Essential Components of Recursion

Every recursive method must have:

### Base Case
The condition that stops the recursion.  
Without a base case, the program will result in infinite recursion and cause a `StackOverflowError`.

### Recursive Case
The part of the method where it calls itself with a smaller or simpler input.

---

## General Structure of a Recursive Method

```java
returnType methodName(parameters) {
    if (baseCondition) {
        return baseResult;
    }
    return methodName(smallerProblem);
}

    n! = n × (n - 1)!
    0! = 1

    public static int factorial(int n) {
    if (n == 0) {      // base case
        return 1;
    }
    return n * factorial(n - 1); // recursive case
}

    factorial(3)
→ 3 * factorial(2)
→ 3 * (2 * factorial(1))
→ 3 * (2 * (1 * factorial(0)))
→ 3 * 2 * 1 * 1

