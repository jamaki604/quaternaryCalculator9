package src.main.logic;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        QuaternaryOperations operations = new QuaternaryOperations();
        Scanner scanner = new Scanner(System.in);

        String firstNum, secondNum;
        char operator;
        String result = "";

        while (true) {
            System.out.println("Enter your first quaternary number:");
            firstNum = scanner.next();
            if (!operations.validQuaternary(firstNum)) {
                System.out.println("Error: Invalid Quaternary Number. Enter a number including only the digits 0, 1, 2, or 3");
                continue;
            }

            System.out.println("Enter operator (+, -, *, /, ^2, √ or q to quit):");
            operator = scanner.next().charAt(0);
            if (operator == 'q' || operator == 'Q') {
                break;
            }

            if (operator == '^' || operator == '√') {
                //Handle single operand operations
                if (operator == '^') {
                    result = operations.square(firstNum);
                    System.out.printf("Result: %s (Quaternary), %d (Decimal)\n", result, operations.convertToDecimal(result));
                } else if (operator == '√') {
                    result = operations.squareRoot(firstNum);
                    System.out.printf("Result: %s (Quaternary), %d (Decimal)\n", result, operations.convertToDecimal(result));
                }
            } else {
                System.out.println("Enter your second quaternary number:");
                secondNum = scanner.next();
                if (!operations.validQuaternary(secondNum)) {
                    System.out.println("Error: Invalid Quaternary Number. Enter a number including only the digits 0, 1, 2, or 3");
                    continue;
                }


                switch (operator) {
                    case '+':
                        result = operations.addition(firstNum, secondNum);
                        break;
                    case '-':
                        result = operations.subtraction(firstNum, secondNum);
                        break;
                    case '*':
                        result = operations.multiplication(firstNum, secondNum);
                        break;
                    case '/':
                        if (operations.convertToDecimal(secondNum) == 0) {
                            System.out.println("Error: Division by zero.");
                        } else {
                            result = operations.division(firstNum, secondNum);
                        }
                        break;
                    default:
                        System.out.println("Invalid operator.");
                        break;
                }
                System.out.printf("Result: %s (Quaternary), %d (Decimal)\n", result, operations.convertToDecimal(result));
            }
        }
        scanner.close();
    }
}


