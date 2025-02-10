# Groovy NullPointerException in List Iteration

This repository demonstrates a common Groovy error: a `NullPointerException` when a method attempts to iterate over a list that's passed in as null.

The `bug.groovy` file contains the problematic code.  The `bugSolution.groovy` file shows how to fix the issue.

## Bug
The `myMethod` function tries to iterate over a list using the `each` method. If a `null` list is passed, a `NullPointerException` is thrown because the `each` method cannot be called on a null object.

## Solution
The solution involves adding a null check before the iteration. This ensures that the `each` method is only called if the list is not null.