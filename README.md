# java-mini-review
Practice writing Java code and using git/GitHub. Complete the github-intro assignment before this one!

## Setup
Fork and clone this repository. Do not forget to fork before cloning! For a refresher on git/GitHub, see the instructions on the github-intro repository. You will not need to create a `cs123` directory again, you can re-use the exisiting one you have already made.
first change gonna happen here

## **Commit Frequently!**
To receive full credit **you MUST commit frequently** for this assignment. At the very least, make one commit after completing each method. Make sure to push after each commit!
 and change 3 comes here
## Coding
Open this repository using VS Code. Edit the Practice.java file to implement the three methods according to the provided javadoc.

## Running Your Code
To run your code, open a terminal and navigate using `cd` to get to the `java-mini-review` directory (folder). Your terminal should show `java-mini-review` in the path. Execute the below command to run your code:

```
javac src/Practice.java && java -cp src Practice
```

This will compile your code and run the main method of the Practice class. Before you implement your solutions, the output will be INCORRECT (it will not print the messages on new lines and it will show false for everything). When you finish your solutions, the output should look like this:

```


///// Print items /////
Calling printItems(new String[]{"welcome", "to", "cs", "123"})
welcome
to
cs
123

Calling printItems(new String[]{"hello", "world"})
hello
world

///// More than Double /////
moreThanDouble(10, 3): true
moreThanDouble(6, 4): false
moreThanDouble(4, 2): false

///// All Start With A /////
allStartWithA(new String[]{"alligators", "are", "AWESOME"}): true
allStartWithA(new String[]{"apes", "can", "be", "amazing"}): false
allStartWithA(new String[]{}): true


```

Note that getting the correct output does NOT guarantee that your code is fully working. It is your resposibility to work on your code to make sure it works for all cases, not just the sample test cases provided.

## Submitting
Make a pull request (PR) against the original repository and submit the URL to your PR on Canvas.
