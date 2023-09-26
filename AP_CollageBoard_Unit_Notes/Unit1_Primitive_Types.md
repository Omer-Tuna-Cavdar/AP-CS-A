# Java Programming Basics

## File Naming and Structure
In Java, every open curly brace `{` must have a matched close curly brace `}`. These are used to start and end class definitions and method definitions.

- Name your Java source file the same as the class name with a `.java` extension.
- All Java code must be defined inside a class in a source file, and the class name must match the file name.

## Printing Output
Java has two methods to print output to the screen:

- `System.out.println(value);`: Prints the value followed by a new line.
- `System.out.print(value);`: Prints the value without advancing to the next line.
- Example: `System.out.println("Hi there!");`

## Syntax Errors and Debugging
- Syntax errors are reported by the compiler if your code is not correctly written.
- Compiler error messages include line numbers and error types.
- Debugging is the process of removing errors.

## Variables
- A variable is a name associated with a memory location in the computer, where you can store a value that can change.
- Variables store data that can vary during program execution.

## Data Types
Java has primitive and object/reference variables. Primitive types include:
- `int`: Stores integers.
- `double`: Stores floating-point numbers.
- `boolean`: Stores Boolean values.
- `String`: A class for sequences of characters.
- Variables must declare their type before usage.

## Assignment Statements & Operators
- Assignment statements initialize or change variable values using `=` (assignment operator).
- Java uses standard math operators (+, -, *, /).
- `==` tests for equality; `!=` tests for inequality.
- Use `+=` and `-=` for compound assignment.
- `++` and `--` increment and decrement values.

## Casting and Range of Values
- Type casting converts values from one type to another.
- `(int)` and `(double)` are casting operators.
- Casting from `double` to `int` truncates decimal values.
- In expressions involving `double`, results are `double`.
- Be cautious when using `==` with `double`.

## Summary
- Java programs start with class definitions.
- `main` is the program entry point.
- Use `System.out.println()` and `System.out.print()` for output.
- Variables have types and limits.
- Assignment statements use `=`.
- Operators perform math operations.
- Casting changes data types.
- Be aware of data type rules and range limits.
