package sample;/**
 * Created by madhu on 6/9/2017.
 */

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Nepal extends Application {
Button button;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Nepall");
        button = new Button("k xa");
        StackPane layout=new StackPane();

        layout.getChildren().add(button);

    }
}
