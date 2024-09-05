package bsu.edu.v2_quaternarycalculator9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class UI extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlFile = new FXMLLoader(getClass().getResource("UI.fxml"));
        Scene scene = new Scene(fxmlFile.load());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }

}
