# Java Debugging Tutorial 


## Debugging Basics

A debugger is a tool, either native to your code editor or an extension to the IDE itself, that is capable of runnning a snippet of code in real time to help developers find flaws (commonly referred to as bugs) within that snippet of code. 

### Debugging Java Tool

In VSCode debugging can be done using a variety of methods.

### Debugging Features in VSCode 

-**Launch Configuration**: The launch configuration is a JSON file that tells VSCode how to run your code. It specifies the program to run, any arguments to pass to the program, and any environment variables that need to be set. You can create a launch configuration by clicking on the gear icon in the Debug view and selecting "Add Configuration".

- **Run and Debug**: The Run and Debug feature in VSCode allows you to run your code in a debugging mode. This mode will allow you to set breakpoints, step through your code, and inspect the state of your program at any given point.
    - Look for a small drop down arrow in the top right corner of the editor window. Click on it and select the "Run and Debug" option.

- **Breakpoints**: A breakpoint is a marker that you can set on a line of code where you want the debugger to pause execution. Once the debugger reaches that line of code, it will pause and allow you to inspect the state of your program at that point.

- **Conditional Breakpoints**: A conditional breakpoint is a breakpoint that is only triggered when a certain condition is met. You can set a condition for a breakpoint by right-clicking on the breakpoint and selecting "Edit Breakpoint". You can then enter a condition that must be true for the breakpoint to be triggered.
    - Expression: The expression that must be true for the breakpoint to be triggered.
    - Hit Count: The number of times the breakpoint must be hit before it is triggered.
    - Log Message: A message that will be logged when the breakpoint is triggered.
        - Does not stop the program, but logs a message to the console.

- **UncaughtExceptions**: An uncaught exception is an exception that is thrown by your program but not caught by any code. This will cause your program to crash. 
    - Uncaught exceptions will cause your program to crash.

- **Caught Exceptions** A caught exception is an exception that is thrown by your program and caught by a try-catch block. This will allow your program to continue running.
    - Caught exceptions will allow your program to continue running.

- **Control Overlay**: The control overlay is a set of buttons that appear at the top of the editor window when you are in debugging mode. These buttons allow you to control the execution of your program, such as stepping through the code, continuing execution, or stopping the program.
    - Continue: This button will continue the execution of your program until the next breakpoint is reached.
    - Step Over: This button will step over the current line of code and move to the next line.
    - Step Into: This button will step into the current line of code and move to the next line.
    - Step Out: This button will step out of the current function and move to the next line of code.
    - Restart: This button will restart the execution of your program from the beginning.
    - Stop: This button will stop the execution of your program.
    - Hot Replacement: This button will allow you to make changes to your code while it is running and apply those changes without restarting the program.

- **CallStack**: The call stack is a list of all the functions that have been called in your program up to the current point. You can view the call stack in the Run and Debug view in VSCode.

- **Run and Debug view**: The Run and Debug view in VSCode allows you to see the state of your program while it is running. You can see the call stack, variables, and output of your program in this view.

- **Run and Debug by line of code**: You can run and debug your code line by line in VSCode. This allows you to step through your code and see how it executes at each step.
    - adds two links above the main method in the editor window: "Run" and "Debug". Click on the "Debug" link to run your code in debugging mode.