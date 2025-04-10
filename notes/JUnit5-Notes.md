# JUnit5 Notes 

For Grants, By Grants 

## JUnit 5 Basics 

JUnit 5 is comprised of JUnit platform, JUnit Jupiter, and JUnit Vintage.

### Downloading JUnit 5
**For Maven**

**For Unmanaged Projects** (projects that are not built using maven or gradle etc)
JUnit 5 has to be downloaded or rather can be downloaded from the Maven dependency repository. The standalone Jar file can be downloaded from the [JUnit 5 Maven Repository](https://mvnrepository.com/artifact/org.junit.platform/junit-platform-console-standalone).
- The standalone jar file is a console launcher that can be used to run tests from the command line.

When deciding which of the jars to download, any jar that is affixed with a code like `1.12.0-m1`, `1.12.0-RC1`, or `*.*.*-ABC` is a milestone or release candidate and should be avoided as they are still in development and undergoing tests. 
- in this case 1.11.4 is the most recent stable release.

### VSCode JUnit 5 Extension
Visual studio code supports JUnit Jupiter and JUnit platform via the Java Extension Pack. The Java extension pack makes the use of the standalone jar simpler for writing tests.
- the jar file is still a necessity for running tests from the command line if there is no build tool like maven or gradle.

## Writing simple tests

### Annotations 
Not all annotations are written into this markdown file. There is a decently large amount of annotations that can be used in JUnit 5. I am collecting annotations i find useful and will add them to this markdown file.

- `@Test` - Denotes that a method is a test method.

- @parameterizedTest - Denotes that a method is a parameterized test method. 
    - parameterized tests make it possible to run a test multiple times with different arguments.

- @repeatedTest - Denotes that a method is a test method that should be repeated a specified number of times.
    - repeated tests make it possible to run a test multiple times with the same or different arguments to ensure that the behavior is consistent.


- @TestFactory - Denotes that a method is a test factory method.
    - test factory methods are used to generate dynamic tests. 
    - dynamic tests are useful for writing tests in a more concise and expressive way.

### Parameterized Tests
Using the `@ParameterizedTest` annotation, we can create a parameterized test that will run the same test multiple times with different arguments. 

```Java
@ParameterizedTest
@CsvSource({
    "0, 32",
    "100, 212",
    "-40, -40",
    "37, 98.6"
})
void testConvertCelsiusToFahrenheit(int celsius, double expectedFahrenheit) {
    double actualFahrenheit = Main.convertCelsiusToFahrenheit(celsius);
    assertEquals(expectedFahrenheit, actualFahrenheit, 0.0001);
}
```
In this snippet:
- `@ParameterizedTest` denotes that the method is a parameterized test method.
- `@CsvSource` provides the arguments for the test method.
    - CSV source is a way to provide arguments to a parameterized test method.
    - the arguments are provided as a comma-separated list of values.
- `void testConvertCelsiusToFahrenheit(int celsius, double expectedFahrenheit)` is the test method that will be run multiple times with different arguments.
    - this test uses the function from the Application code to convert celsius to fahrenheit.
    - the expected fahrenheit value is provided as an argument to the test method.
- `assertEquals(expectedFahrenheit, actualFahrenheit, 0.0001)` is used to assert that the actual fahrenheit value is equal to the expected fahrenheit value.
    - the third argument is the delta value which is used to compare floating-point numbers.
    - Delta refers to the difference between the expected and actual values that is allowed for the test to pass.

**Run the test** Using `mvn test` will run the test and output the results to the console.


## Console Launcher 

The Junit console launcher is a standalone tool for launching the JUnit platform from the console.
- allows the developer to run tests from the command line without the need for an IDE.
- recieve logs from tests withing the console.





### Unnecessary Information
javac -cp ".;lib/junit-platform-console-standalone-x.x.x.jar" module-2/assignment1/src/Main.java module-2/assignment1/src/MainTest.java

As of right now, my Java-notes directory looks like this:
```
Java-notes/
│── lib/
│   └── junit-platform-console-standalone-1.11.4.jar
│── module-2/
│   └── assignment1/
│       ├── src/
│       │   ├── Main.java
│       │   └── MainTest.java
```

I will probably be setting up future directories in a similar fashion for modules going forward. Given that the directory looks like this could i still achieve the same results with this structure? 

For my Main.Java, the code looks like this: 
```Java
package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ask the user for the temperature in Fahrenheit
        System.out.println("Enter the temperature in Fahrenheit: ");

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Read the temperature in Fahrenheit
        double Celsius = scanner.nextDouble();

        double Fahrenheit = (Celsius * 9/5) + 32;

        System.out.println("The temperature in Fahrenheit is: " + Fahrenheit);
    }
}
```

I need to create 4 different tests or a single parameterized test that will test for the values of 0, 100, -40, and 37 degrees celsius being converted to the correct Fahrenheit values.