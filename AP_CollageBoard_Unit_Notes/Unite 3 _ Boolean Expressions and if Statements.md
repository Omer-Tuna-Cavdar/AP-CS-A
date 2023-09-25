## Unite 3 _ Boolean Expressions and if Statements
### Boolean Expressions:

`Definition: `

A Boolean expression is a statement in programming that evaluates to either true or false. These expressions are fundamental for making decisions in your code.

`Relational Operators:`

 Boolean expressions often involve relational operators that allow you to compare values. Common relational operators include:

`==` (equals): Checks if two values are equal.

`<` (less than): Checks if one value is less than another.

`>` (greater than): Checks if one value is greater than another.

`<=` (less than or equal to): Checks if one value is less than or equal to another.

`>=` (greater than or equal to): Checks if one value is greater than or equal to another.

`Logical Operators:`

 Boolean expressions can also use logical operators to combine conditions. Common logical operators include:

`&&` (and): Evaluates to true if both conditions are true.

`||` (or): Evaluates to true if at least one condition is true.

`!` (not): Negates the value of a condition, turning true into false and vice versa.

`Decision Making: `

Boolean expressions are used to make decisions in programs. For example, you might use an if statement to perform a specific action if a certain condition is true.

### If Statements:

`Definition:`

An if statement is used to execute a block of code conditionally. It allows your Java program to take different paths based on the evaluation of a Boolean expression.

`Basic Structure: `

The basic structure of an if statement is as follows:

if (condition) {
    // Code to be executed if the condition is true
}

`Conditional Execution: `

The code inside the curly braces {} is executed only if the condition within the parentheses is true. If the condition is false, the code inside the curly braces is skipped.

``if-else Statements ``

 You can extend the basic if statement with an else clause to specify what should happen if the condition is false. For example:

if (condition) {
    // Code to be executed if the condition is true
} else {
    // Code to be executed if the condition is false
}

`if-else if-else Statements:` 

You can chain multiple conditions together using else if to handle different cases:

if (condition1) {
    // Code to be executed if condition1 is true
} else if (condition2) {
    // Code to be executed if condition2 is true
} else {
    // Code to be executed if neither condition1 nor condition2 is true
}

`Nested if Statements:`

 You can place if statements inside other if statements, creating more complex decision-making structures.

`Short-Circuit Evaluation:` 

 Short-circuit evaluation for logical operators (&& and ||). This means that the evaluation stops as soon as the outcome is determined. For example, in A && B, if A is false, B is not even checked.

