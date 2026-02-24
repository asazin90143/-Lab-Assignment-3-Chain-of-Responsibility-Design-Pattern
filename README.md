# Chain of Responsibility: ATM Dispense System

An implementation of the **Chain of Responsibility** design pattern simulating a Bank of the Philippine Islands (BPI) ATM that dispenses specific cash denominations.

## 📌 Project Overview
This project demonstrates how to distribute responsibilities among multiple objects. The system processes cash withdrawal requests by passing them through a chain of handlers (1000s, 500s, and 100s) until the full amount is dispensed.

### Module Objectives
*   **Distribution of Responsibility:** Enable multiple objects to handle a single request.
*   **Maintainability:** Promote the Single Responsibility Principle for each object in the chain.
*   **Dynamic Handling:** Explore how request handling is decided at runtime.

---

## 🛠 Elements of the Pattern
*   **Request (`Currency`):** The data structure containing the amount to be processed.
*   **Handler (`DispenseChain`):** The interface defining how to link handlers and process requests.
*   **Concrete Handlers:** `Peso1000Dispenser`, `Peso500Dispenser`, and `Peso100Dispenser`.
*   **Chain Controller (`ATMDispenseChain`):** The class that initializes the sequence and starts the process.

---

## 🚀 How It Works
1.  The **Client** (`BPI_Atm`) sends an amount to the chain.
2.  The **1000-Peso Handler** checks if it can dispense any bills. It passes the **remainder** to the next link.
3.  The **500-Peso Handler** takes the remainder, processes it, and passes the rest down.
4.  The **100-Peso Handler** completes the transaction.

---

## 💻 Code Structure

### 1. The Request Object
```java
public class Currency {
    private int amount;
    public Currency(int amt) { this.amount = amt; }
    public int getAmount() { return this.amount; }
}
