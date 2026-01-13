# Java `this` Keyword Notes

## 1. What is `this`?

- `this` is a **reference to the current object**.
- It refers to the **object that is calling the method or constructor**.
- Helps **differentiate instance variables from local variables** when they have the same name.

---

## 2. Basic Syntax

```java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name; // 'this' resolves ambiguity
        this.age = age;
    }
}
