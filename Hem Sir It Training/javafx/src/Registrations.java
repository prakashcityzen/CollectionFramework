import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by madhu on 6/12/2017.
 */
public class Registrations extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent= FXMLLoader.load(getClass().getResource("registrationform.fxml"));
        Scene scene=new Scene(parent,1000,500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
