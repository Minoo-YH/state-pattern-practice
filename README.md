# State Design Pattern

This is a simple Java project for practicing the **State Design Pattern**.

In this project, I used a ticket vending machine as an example.  
The machine has different states, and its behavior changes depending on the current state.

## States

The ticket machine has four states:

- ReadyState
- TicketSelectionState
- PaymentState
- PrintingState

The state flow is:

```text
ReadyState
    ↓
TicketSelectionState
    ↓
PaymentState
    ↓
PrintingState
    ↓
ReadyState
```

## How It Works

The `State` interface defines the `action()` method.

```java
public interface State {
    void action();
}
```

Each state implements the `State` interface and has its own behavior.

For example, `ReadyState` shows that the machine is ready and then changes the state to `TicketSelectionState`.

The `Machine` class stores the current state:

```java
private State state;
```

The state can be changed using:

```java
setState()
```

The machine runs the action of its current state using:

```java
state.action();
```

This means the `Machine` does not need to know exactly what each state does.  
Each state is responsible for its own behavior.

## Example Output

```text
Machine is ready
Selecting ticket
Waiting for payment
Printing ticket
```

## What I Learned

I learned that the State Design Pattern is useful when an object can have different states and its behavior depends on the current state.

Instead of writing many `if/else` or `switch` statements, we can create a separate class for each state.

This makes the code easier to understand and easier to extend when we want to add new states.