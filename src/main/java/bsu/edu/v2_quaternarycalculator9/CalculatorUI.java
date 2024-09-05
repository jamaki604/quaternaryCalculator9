package bsu.edu.v2_quaternarycalculator9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class CalculatorUI extends Application {

    public TextArea inputBox;
    public TextArea outputBox;
    public Button squaredButton;
    public Button squareRootButton;
    public Button additionButton;
    public Button subtractionButton;
    public Button multiplicationButton;
    public Button divisionButton;
    public Button zeroButton;
    public Button oneButton;
    public Button twoButton;
    public Button threeButton;
    public Button equalsButton;
    public Button toggleButton;
    public Button clearButton;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlFile = new FXMLLoader(getClass().getResource("UI.fxml"));
        Scene scene = new Scene(fxmlFile.load());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void onClearClicked() {
        inputBox.clear();
        outputBox.clear();
    }

    public void onZeroClicked() {
        inputBox.appendText("0");
    }

    public void onOneClicked() {
        inputBox.appendText("1");
    }

    public void onTwoClicked() {
        inputBox.appendText("2");
    }

    public void onThreeClicked() {
        inputBox.appendText("3");
    }
}
