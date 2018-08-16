import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

/**
 * Created by madhu on 6/11/2017.
 */
public class Login extends Application {
    private GridPane parent;
    private Button username,password,login;
    private TextField pword,uname;

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void init() throws Exception {
        super.init();
        username=new Button("usename");
        pword=new TextField();
        password=new Button("password");
        uname=new TextField();
        login=new Button("login");

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Login");
        parent=new GridPane();
        setButton();
        Scene scene=new Scene(parent);
        scene.setFill(Paint.valueOf("RED"));
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    private void setButton(){
        parent.add(username,0,0,1,1);
        parent.add(uname,0,1,1,1);
        parent.add(password,1,0,1,1);
        parent.add(pword,1,1,1,1);
        parent.add(login,0,2,2,2);
        parent.setHgap(20);
        parent.setVgap(20);
        parent.setAlignment(Pos.CENTER);
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }
}
