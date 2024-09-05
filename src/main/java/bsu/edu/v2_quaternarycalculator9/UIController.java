package bsu.edu.v2_quaternarycalculator9;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import java.util.ArrayList;

public class UIController {
    public TextArea inputBox, outputBox;
    public Button squareRootButton, additionButton, subtractionButton, multiplicationButton, divisionButton, squaredButton, equalsButton, toggleButton, clearButton;
    public Button zeroButton, oneButton, twoButton, threeButton;
    QuaternaryOperations operations = new QuaternaryOperations();
    public ArrayList<String> userInput = new ArrayList<>();
    String firstNum, secondNum, operator, result;

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
            result = calculateUnaryOperation();
            outputBox.appendText(result);
        } else if (validateUserInput() == 2) {
            result = calculateBinaryOperation();
            outputBox.appendText(result);
        } else {
            outputBox.appendText("invalid input");
        }
    }

    public void onToggleClicked() {
    }

    public void addUserInput(String displayText, String input) {
        inputBox.appendText(displayText);
        userInput.add(input);
    }

    public int validateUserInput(){
        if (userInput.size() == 2) {
            if ((operations.validQuaternary(userInput.get(0))) && (operations.validUnaryOperator(userInput.get(1)))) {
                return 1;
            }
        }  else if ((userInput.size() == 3)) {
            if ((operations.validQuaternary(userInput.get(0))) && (operations.validBinaryOperator(userInput.get(1))) && operations.validQuaternary(userInput.get(2))) {
                return 2;
            }
        }
        return 0;
    }

    public String calculateUnaryOperation() {
        firstNum = userInput.get(0);
        operator = userInput.get(1);

        if (operator.equals("^")) {
            result = operations.square(firstNum);
        } else if (operator.equals("&")) {
            result = operations.squareRoot(firstNum);
        }

        return result;
    }

    public String calculateBinaryOperation() {
        firstNum = userInput.get(0);
        operator = userInput.get(1);
        secondNum = userInput.get(2);

        switch (operator) {
            case "+" -> result = operations.addition(firstNum, secondNum);
            case "-" -> result = operations.subtraction(firstNum, secondNum);
            case "*" -> result = operations.multiplication(firstNum, secondNum);
            case "/" -> {
                if (operations.convertToDecimal(secondNum) == 0) {
                    outputBox.appendText("Error: Division by zero.");
                } else {
                    result = operations.division(firstNum, secondNum);
                }
            }
        }

        return result;
    }


}
