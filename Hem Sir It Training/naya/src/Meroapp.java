/**
 * Created by madhu on 5/21/2017.
 */
public class Meroapp{
    public static void main(String[] args) {
        Calculator sumCalculator=(a ,b)->{
            return a+b;
        };
        Calculator diffCalculator=(c,b)->{return (c - b);};
    Game game=()-> {
        System.out.println("This is game interface");
    };
    game.play();
        System.out.println(diffCalculator.calculate(12,1234));
        System.out.println(sumCalculator.calculate(12,1234));
    }
    public void onClick(){

    }


}
