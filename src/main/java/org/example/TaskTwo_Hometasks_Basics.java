package org.example;

public class TaskTwo_Hometasks_Basics {

    public static void main(String[] args) {

        //Task2.1
        System.out.println("\nTask 2.1"); //Printing name using command line argument
        try {
            printCommandLineVariable(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please enter name in command line argument.");
        }

        //Task2.2
        System.out.println("\nTask 2.2"); //Calculator using command line variables
        if (args.length != 3) {
            System.out.println("Enter Command line Argument in the following format : <operand1> <operator> <operand2>");
        } else {
            calculator(args[0], args[2], args[1]);
        }
    }

    public static void printCommandLineVariable(String name) {
        System.out.println("Hello " + name);
    }

    public static void calculator(String op1, String op2, String operator) {
        try {
            double num1 = Double.parseDouble(op1);
            double num2 = Double.parseDouble(op2);

            double result = 0;
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    System.out.println("Sum :" + result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println("Difference :" + result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println("Product :" + result);
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero");
                        return;
                    }
                    result = num1 / num2;
                    System.out.println("Quotient :" + result);
                    break;
                case "%":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero");
                        return;
                    }
                    result = num1 % num2;
                    System.out.println("Reminder :" + result);
                    break;
                case "percentage":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero");
                        return;
                    }
                    result = (num1 / num2) * 100;
                    System.out.println("Percentage :" + result);
                    break;
                default:
                    System.out.println("Error: Invalid operation. Use one of +, -, *, /, %, percentage");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers");
        }
    }
}

