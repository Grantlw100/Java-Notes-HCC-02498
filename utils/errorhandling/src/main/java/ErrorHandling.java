package errorhandling;

import java.util.Scanner;
import java.util.List;
import java.util.regex.*;
import prompt.Prompt;


import java.util.Arrays;

/************************************************************************************************************************************************************************************/
/*                                                                                                                                                                                  */
/*                              INPUT VALIDATOR                                                                                                                                     */
/* Use this function to validate all inputs. Usage directions at the bottom.                                                                                                        */
/*                                                                                                                                                                                   */
/************************************************************************************************************************************************************************************/


public class ErrorHandling {
    // public static void main(String[] args) {
    //     System.out.println("Running from class: " + Prompt.class.getName());
    //     System.out.println("Class location: " + Prompt.class.getResource("Prompt.class"));
    // }
    public static Object[] handlePrompts(List<Prompt> prompts, Scanner input)
    {
        Object[] returnValues = new Object[prompts.size()];

        for (int i = 0; i < prompts.size(); i++) {
            Prompt prompt = prompts.get(i);
            String message = prompt.getMessage();
            String type = prompt.getType();

            boolean valid = false;
            Object value = null;

            String expectedString = "";
            String regexPattern = "";

            // Type preprocessing
            if (type.toLowerCase().startsWith("string:")) {
                expectedString = type.substring(7);
                type = "string_compare";
            } else if (type.toLowerCase().startsWith("regex:")) {
                regexPattern = type.substring(6);
                type = "regex";
            }

            while (!valid) {
                System.out.println(message);
                String userInput = input.nextLine().trim();

                switch (type.toLowerCase()) {
/*CASE INT--------------------------------------------------------------------------------------------------------*/
                    case "int":
                        try {
                            value = Integer.parseInt(userInput);
                            valid = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Expected an integer.");
                        }
                        break;


/*CASE DOUBLE--------------------------------------------------------------------------------------------------------*/
                    case "double":
                        try {
                            value = Double.parseDouble(userInput);
                            valid = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Expected a double.");
                        }
                        break;


/*CASE FLOAT--------------------------------------------------------------------------------------------------------*/
                    case "float":
                        try {
                            value = Float.parseFloat(userInput);
                            valid = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Expected a float.");
                        }
                        break;


/*CASE CHAR--------------------------------------------------------------------------------------------------------*/
                    case "char":
                        if (userInput.length() == 1) {
                            value = userInput.charAt(0);
                            valid = true;
                        } else {
                            System.out.println("Invalid input. Expected a single character.");
                        }
                        break;


/*CASE STRING--------------------------------------------------------------------------------------------------------*/
                    case "string":
                        value = userInput;
                        valid = true;
                        break;


/*CASE STRING COMPARISON--------------------------------------------------------------------------------------------------------*/
                    case "string_compare":
                        if (userInput.equalsIgnoreCase(expectedString)) {
                            value = userInput;
                            valid = true;
                        } else {
                            System.out.println("Invalid input. Expected: " + expectedString);
                        }
                        break;


/*CASE REGULAR EXPRESSION--------------------------------------------------------------------------------------------------------*/
                    case "regex":
                        Pattern pattern = Pattern.compile(regexPattern);
                        Matcher matcher = pattern.matcher(userInput);
                        if (matcher.matches()) {
                            value = userInput;
                            valid = true;
                        } else {
                            System.out.println("Input does not match the required pattern.");
                        }
                        break;


/*CASE YES OR NO--------------------------------------------------------------------------------------------------------*/
                    case "yesorno":
                        if (userInput.equalsIgnoreCase("Y") ) {
                            value = "Y";
                            valid = true;
                        } else if (userInput.equalsIgnoreCase("N")) {
                            value = "N";
                            valid = true;
                        } else {
                            System.out.println("Invalid input. Enter Y or N only.");
                        }
                        break;


/*CASE INTEGER ARRAY--------------------------------------------------------------------------------------------------------*/
                    case "intarray":
                        try {
                            int[] intArray = Arrays.stream(userInput.trim().split("\\s+"))
                                                    .mapToInt(Integer::parseInt)
                                                    .toArray();
                            value = intArray;
                            valid = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Expected space-separated integers.");
                        }
                        break;

            
                    
/*CASE DOUBLE ARRAY--------------------------------------------------------------------------------------------------------*/
                    case "doublearray":
                        try {
                            double[] doubleArray = Arrays.stream(userInput.trim().split("\\s+"))
                                                         .mapToDouble(Double::parseDouble)
                                                         .toArray();
                            value = doubleArray;
                            valid = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Expected space-separated decimals.");
                        }
                        break;


/*CASE PERCENTS--------------------------------------------------------------------------------------------------------*/
                    case "percent":
                        try {
                            float parsed = Float.parseFloat(userInput);
                            
                            // Heuristic: if input has no decimal and is >= 1, assume it's a percent
                            if (!userInput.contains(".") && parsed >= 2) {
                                parsed /= 100f;
                            }
                    
                            value = parsed;
                            valid = true;
                    
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Expected a decimal or whole number.");
                        }
                        break;
                    
                    default:
                        System.out.println("Unsupported type: " + type);
                        valid = true;
                }
            }

            returnValues[i] = value;
        }

        return returnValues;
    }
}


/* USAGE

zPass in the Scanner method

 List<Prompt> prompts = List.of(
    new Prompt("Enter your full name", "string"),
    new Prompt("Enter your age", "int"),
    new Prompt("Enter your GPA", "double"),
    new Prompt("Do you accept? (Y/N)", "yesorno"),
    new Prompt("Enter email", "regex:^[A-Za-z0-9+_.-]+@(.+)$")
);

Object[] results = ErrorHandling.handlePrompts(prompts, input);

// Example unwrErrorHandlinging
String name = (String) results[0];
int age = (int) results[1];
double gpa = (double) results[2];
String consent = (String) results[3];
String email = (String) results[4];

 */