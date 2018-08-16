/**
 * Created by madhu on 5/19/2017.
 */
public class Myapp {
    private static MyButton mybutton,sendButton,DeleteButton;

    public static void main(String[] args) {
        boolean issendbuttonclick =false;
        boolean isdeletebuttonclick=true;
        sendButton=new MyButton(5,3,"send");
        DeleteButton=new MyButton(5,3,"Delete");

        if(issendbuttonclick) {
            sendButton.setButtonClickedListener(new ButtonClick() {
                @Override
                public void buttonClicked() {
                    System.out.println("send button clicked message sent");
                }
            });
        }
            if(isdeletebuttonclick) {
                DeleteButton.setButtonClickedListener(new ButtonClick() {
                    @Override
                    public void buttonClicked() {
                        System.out.println("delete button clicked photo deleted");
                    }
                });
            }
        Car mycar=new Car();
        mycar.stopEngine();
        mycar.startEngine();
        mycar.brakefail();
    }
}
