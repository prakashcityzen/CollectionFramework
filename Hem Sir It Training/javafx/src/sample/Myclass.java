package sample;
        import javafx.application.Application;
        import javafx.geometry.Pos;
        import javafx.scene.Scene;
        import javafx.scene.control.Alert;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextField;
        import javafx.scene.layout.GridPane;
        import javafx.scene.paint.Paint;
        import javafx.stage.Stage;//stage create windows working components

        import javafx.event.ActionEvent;
/**
 * Created by bibek on 6/1/2017.
 */
public class Myclass extends Application {
    private Button subbtn,sumbtn,mulbtn,clrbtn,dvdbtn;
    private TextField num1,num2;
    private Label answer;
    private GridPane parent;

    @Override
    public void init() throws Exception {
        super.init();
        subbtn =new Button("-");
        sumbtn =new Button("+");
        mulbtn =new Button("*");
        dvdbtn =new Button("/");
        clrbtn=new Button("clr");
        num1=new TextField();
        num2=new TextField();

        answer=new Label();

        sumbtn.setPrefWidth(70);
        subbtn.setPrefWidth(70);
        mulbtn.setPrefWidth(70);
        dvdbtn.setPrefWidth(70);
        num1.setPrefWidth(70);
        num2.setPrefWidth(70);

        answer.setPrefWidth(140);
        clrbtn.setPrefWidth(140);
        System.out.println("in init()");
    }

    @Override
    public void start(Stage primarystage) throws Exception {
        System.out.println("in start()");

        parent= new GridPane();//Parent rows column ko lagi
        setChildren();
        //setEventHandler();
        Scene scene = new Scene(parent);
        scene.setFill(Paint.valueOf("#88B675"));
        primarystage.setScene(scene);
        primarystage.show();

    }
    private void setChildren(){
        parent.add(answer,0,0,2,1);
        parent.add(subbtn,0,1);
        parent.add(sumbtn,1,1);
        parent.add(mulbtn,0,2);
        parent.add(dvdbtn,1,2);


        parent.add(num1,0,3);
        parent.add(num2,1,3);

        parent.add(clrbtn,0,4,2,1);
        parent.setHgap(20);
        parent.setVgap(20);
        parent.setAlignment(Pos.CENTER);
    }
    private void setEventHandler(){
        sumbtn.setOnAction(event->onButtonClick(event));
        subbtn.setOnAction(event->onButtonClick(event));
        mulbtn.setOnAction(event->onButtonClick(event));
        dvdbtn.setOnAction(event->onButtonClick(event));
        clrbtn.setOnAction(event->onButtonClick(event));
    }
    private void onButtonClick(ActionEvent event) {
        if(num1.getText().equals("")&&num2.getText().equals(""));{
            Alert alert=new Alert(Alert.AlertType.WARNING);
            alert.setTitle("hawa naahann vai");
            alert.setHeaderText("This is header");
            alert.setContentText("kutdim");
            alert.show();
        }
        if (event.getSource() == sumbtn) {
            int n1=Integer.parseInt(num1.getText());
            int n2=Integer.parseInt(num2.getText());
            int sum=n1+n2;
            answer.setText(n1+"+"+n2+"="+sum);

        }
        else if(event.getSource() == subbtn) {
            int n1=Integer.parseInt(num1.getText());
            int n2=Integer.parseInt(num2.getText());
            int sum=n1-n2;
            answer.setText(n1+"-"+n2+"="+sum);

        }

        else if(event.getSource() == mulbtn) {
            int n1=Integer.parseInt(num1.getText());
            int n2=Integer.parseInt(num2.getText());
            int sum=n1*n2;
            answer.setText(n1+"*"+n2+"="+sum);

        }

        else if(event.getSource() == dvdbtn) {
            int n1=Integer.parseInt(num1.getText());
            int n2=Integer.parseInt(num2.getText());
            int sum=n1/n2;
            answer.setText(n1+"/"+n2+"="+sum);

        }

        else if(event.getSource()==clrbtn){
            num1.setText("");
            num2.setText("");
            answer.setText("answer");
            num1.requestFocus();

        }
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("in stop()");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
