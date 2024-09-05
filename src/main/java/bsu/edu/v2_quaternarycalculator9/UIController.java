package bsu.edu.v2_quaternarycalculator9;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;

import java.util.ArrayList;

public class UIController {
    public TextArea inputBox, outputBox;
    public Button squareRootButton, additionButton, subtractionButton, multiplicationButton, divisionButton, squaredButton, equalsButton, clearButton;
    public ToggleButton toggleButton;
    public Button zeroButton, oneButton, twoButton, threeButton;
    QuaternaryOperations operations = new QuaternaryOperations();
    public ArrayList<String> userInput = new ArrayList<>();
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

    // don't know if there's a more standard replacement for √, so i just picked something random that wasn't being used, BUT this can be changed if you do know
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

    // pattern matching wasn't working with √ and ², so they're displayed in the input box differently than how they're actually added in the userInput variable to do calculations
    public void addUserInput(String display, String input) {
        inputBox.appendText(display);
        userInput.add(input);
    }

    public int validateUserInput() {
        switch (userInput.size()) {
            case 2 -> {
                if (operations.validQuaternary(userInput.get(0)) &&
                    operations.validUnaryOperator(userInput.get(1))) {
                    return 1;
                }
            }
            case 3 -> {
                if (operations.validQuaternary(userInput.get(0)) &&
                    operations.validBinaryOperator(userInput.get(1)) &&
                    operations.validQuaternary(userInput.get(2))) {
                    return 2;
                }
            }
        }

        return 0;
    }

    public String calculateUnaryOperation() {
        firstNum = userInput.get(0);
        operator = userInput.get(1);

        if (operator.equals("^")) {
            quaternaryResult = operations.square(firstNum);
        } else if (operator.equals("&")) {
            quaternaryResult = operations.squareRoot(firstNum);
        }

        return quaternaryResult;
    }

    public String calculateBinaryOperation() {
        firstNum = userInput.get(0);
        operator = userInput.get(1);
        secondNum = userInput.get(2);

        switch (operator) {
            case "+" -> quaternaryResult = operations.addition(firstNum, secondNum);
            case "-" -> quaternaryResult = operations.subtraction(firstNum, secondNum);
            case "*" -> quaternaryResult = operations.multiplication(firstNum, secondNum);
            case "/" -> {
                if (operations.convertToDecimal(secondNum) == 0) {
                    quaternaryResult = "Error: Division by zero";
                } else {
                    quaternaryResult = operations.division(firstNum, secondNum);
                }
            }
        }

        return quaternaryResult;
    }


}
