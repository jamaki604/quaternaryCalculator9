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
        /*
        you can mess with this and change it if there's a better way to do this it's not heavy on javafx specific stuff at all
        just make sure to include the outputBox.setText(quaternaryResult) line so that it gets displayed on the UI
         */
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
        userInput.add(input); // change this if you change the type of userInput
    }

    public int validateUserInput() {
        /*
        - i tried turning the  user input arraylist into a string and then use a delimiter, but i probably did something wrong because the
        output for that was coming out really weird for me
        - just need to get the right numbers set = firstNum, secondNum, and operator to get the UI to work right
        - if there is a value for firstNum and operator return 1 and then if that + secondNum had a value return 2 because onEqualsButtonClicked
        uses that to determine if it should do a unary or binary operation
         */
        return 0;
    }

    public String calculateUnaryOperation() {
        if (operator.equals("^")) {
            quaternaryResult = operations.square(firstNum);
        } else if (operator.equals("&")) {
            quaternaryResult = operations.squareRoot(firstNum);
        }

        return quaternaryResult;
    }

    public String calculateBinaryOperation() {
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
