package bsu.edu.v2_quaternarycalculator9;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;

import java.util.ArrayList;
import java.util.Arrays;

public class UIController {
    public TextArea inputBox, outputBox;
    public Button squareRootButton, additionButton, subtractionButton, multiplicationButton, divisionButton, squaredButton, equalsButton, clearButton;
    public ToggleButton toggleButton;
    public Button zeroButton, oneButton, twoButton, threeButton;
    QuaternaryOperations operations = new QuaternaryOperations();
    public ArrayList<String> userInput = new ArrayList<>(); // this could be changed to something else if there's a better way, i just used an arraylist since i could append each input to it
    String firstNum, secondNum, operator, quaternaryResult, decimalResult;

    public void onClearClicked() {
        inputBox.clear();
        outputBox.clear();
        userInput.clear();
    }

    public void onZeroClicked() {
        addUserInput("0", "0");
    }

    public void onOneClicked() {
        addUserInput("1", "1");
    }

    public void onTwoClicked() {
        addUserInput("2", "2");
    }

    public void onThreeClicked() {
        addUserInput("3", "3");
    }

    public void onSquaredButtonClicked() {
        addUserInput("²", "^");
    }

    public void onSquareRootButtonClicked() {
        addUserInput("√", "&");
    }

    public void onAdditionButtonClicked() {
        addUserInput("+", "+");
    }

    public void onSubtractionButtonClicked() {
        addUserInput("-", "-");
    }

    public void onMultiplicationButtonClicked() {
        addUserInput("*", "*");
    }

    public void onDivisionButtonClicked() {
        addUserInput("/", "/");
    }

    public void onEqualsButtonClicked() {
        if (validateUserInput() == 1) {
            quaternaryResult = calculateUnaryOperation();
            outputBox.setText(quaternaryResult);
        } else if (validateUserInput() == 2) {
            quaternaryResult = calculateBinaryOperation();
            outputBox.setText(quaternaryResult);
        } else {
            outputBox.setText("invalid input");
        }
    }

    public void onToggleClicked() {
        decimalResult = String.valueOf(operations.convertToDecimal(quaternaryResult));

        if (toggleButton.isSelected()) {
            outputBox.setText(decimalResult);
            toggleButton.setText("Q");
        } else {
            outputBox.setText(quaternaryResult);
            toggleButton.setText("D");
        }
    }

    public void addUserInput(String display, String input) {
        inputBox.appendText(display);
        userInput.add(input);
    }

    public int validateUserInput() {

        String inputString = inputBox.getText();


        if (inputString.matches(".*[√²].*")) {
            if (inputString.contains("²") || inputString.contains("√")) {
                operator = inputString.contains("²") ? "^" : "&";
                firstNum = inputString.replaceAll("[^0-3]", "");
                return 1;
            }
        }


        String[] parts = inputString.split("[+\\-*/]");
        if (parts.length == 2) {
            firstNum = parts[0].trim();
            secondNum = parts[1].trim();
            // Determine the operator
            if (inputString.contains("+")) operator = "+";
            else if (inputString.contains("-")) operator = "-";
            else if (inputString.contains("*")) operator = "*";
            else if (inputString.contains("/")) operator = "/";

            return 2;
        }

        return 0; // Invalid input
    }



    public String calculateUnaryOperation() {
        if (firstNum == null || operator == null) {
            return "Error: Missing input";
        }

        try {
            if (operator.equals("^")) {
                return String.valueOf(operations.square(firstNum));
            } else if (operator.equals("&")) {
                return String.valueOf(operations.squareRoot(firstNum));
            } else {
                return "Error: Unknown unary operator";
            }
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    public String calculateBinaryOperation() {
        if (firstNum == null || secondNum == null || operator == null) {
            return "Error: Missing input";
        }

        try {
            switch (operator) {
                case "+":
                    return String.valueOf(operations.addition(firstNum, secondNum));
                case "-":
                    return String.valueOf(operations.subtraction(firstNum, secondNum));
                case "*":
                    return String.valueOf(operations.multiplication(firstNum, secondNum));
                case "/":
                    if (operations.convertToDecimal(secondNum) == 0) {
                        return "Error: Division by zero";
                    } else {
                        return String.valueOf(operations.division(firstNum, secondNum));
                    }
                default:
                    return "Error: Unknown binary operator";
            }
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}

