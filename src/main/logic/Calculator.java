package src.main.logic;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        QuaternaryOperations operations = new QuaternaryOperations();
        Scanner scanner = new Scanner(System.in);

        String firstNum, secondNum;
        char operator;
        while (true) {
            System.out.println("Enter your first quaternary number:");
            firstNum = scanner.next();

            System.out.println("Enter operator (+, -, *, /, ^2, √ or q to quit):");
            operator = scanner.next().charAt(0);
            if (operator == 'q' || operator == 'Q') {
                break;
            }

            if (operator == '^' || operator == '√') {
                //Handle single operand operations
                if (operator == '^') {
                    System.out.println("Result (Quaternary): " + operations.square(firstNum));
                } else if (operator == '√') {
                    System.out.println("Result (Quaternary): " + operations.squareRoot(firstNum));
                }
            } else {
                System.out.println("Enter your second quaternary number:");
                secondNum = scanner.next();

                switch (operator) {
                    case '+':
                        System.out.println("Result (Quaternary): " + operations.addition(firstNum, secondNum));
                        break;
                    case '-':
                        System.out.println("Result (Quaternary): " + operations.subtraction(firstNum, secondNum));
                        break;
                    case '*':
                        System.out.println("Result (Quaternary): " + operations.multiplication(firstNum, secondNum));
                        break;
                    case '/':
                        if (operations.convertToDecimal(secondNum) == 0) {
                            System.out.println("Error: Division by zero.");
                        } else {
                            System.out.println("Result (Quaternary): " + operations.division(firstNum, secondNum));
                        }
                        break;
                    default:
                        System.out.println("Invalid operator.");
                        break;
                }
            }
        }
        scanner.close();
    }
}


