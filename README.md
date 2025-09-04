# 🔹 Java Abstract Class Example

This Java project demonstrates **abstract classes**, **method overriding**, **final methods**, **static methods**, and **anonymous classes**.  

---

## 📝 Classes Overview

### 1. `Base` (Abstract Class)
- **Abstract method:** `fun()` — must be implemented by derived classes.
- **Non-abstract method:** `nofun()` — can be called directly.
- **Final method:** `lastfun()` — cannot be overridden.
- **Static method:** `staticfun()` — independent of instances.
- Constructor prints a message when called.

### 2. `Derived` (Concrete Class)
- Extends `Base` and **implements abstract method `fun()`**.
- Calls super class methods and prints messages in the constructor.

### 3. Anonymous Class
- Creates an **anonymous subclass of `Base`**.
- Implements abstract method `fun()` without defining a separate class.

---

## 🚀 How to Run

1. Compile the program:
```bash
javac AbstractEx.java
````

2. Run the program:

```bash
java AbstractEx
```

3. Output demonstrates:

   * Abstract class constructor execution
   * Method overriding
   * Final and static methods
   * Anonymous class usage

---

## ⚡ Example Output

```
Base Constructor Called
no abstract of astract class
Base lastfun() called
independent Fun
Derived Constructor Called
Derived fun() called
Base lastfun() called
no abstract of astract class
independent Fun
Derived fun() called
zrk
no abstract of astract class
Base lastfun() called
independent Fun
5
```

---

## 🛠 Concepts Demonstrated

* Abstract class and abstract methods
* Method overriding rules
* Final methods
* Static methods
* Anonymous classes
* Object references of abstract class type

---

## 📜 License

This project is licensed under the **MIT License**.
You are free to use, modify, and distribute this code.

---


Do you want me to do that?
```
