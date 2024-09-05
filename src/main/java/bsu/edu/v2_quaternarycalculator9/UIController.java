package bsu.edu.v2_quaternarycalculator9;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import java.util.ArrayList;

public class UIController {
    public TextArea inputBox, outputBox;
    public Button squareRootButton, additionButton, subtractionButton, multiplicationButton, divisionButton, squaredButton, equalsButton, toggleButton, clearButton;
    public Button zeroButton, oneButton, twoButton, threeButton;
    public ArrayList<String> userInput = new ArrayList<>();

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
        if (validateInput(userInput) == 0) {
            // TODO: add logic
            outputBox.appendText("valid input");
        } else if (validateInput(userInput) == 1) {
            // TODO: add logic
            outputBox.appendText("valid input");
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

    public int validateInput(ArrayList<String> userInput){
        if (userInput.size() == 2) {
            if ((QuaternaryOperations.validQuaternary(userInput.get(0))) && (QuaternaryOperations.validUnaryOperator(userInput.get(1)))) {
                return 0;
            }
        }  else if ((userInput.size() == 3)) {
            if ((QuaternaryOperations.validQuaternary(userInput.get(0))) && (QuaternaryOperations.validBinaryOperator(userInput.get(1))) && QuaternaryOperations.validQuaternary(userInput.get(2))) {
                return 1;
            }
        }
        return -1;
    }

}
