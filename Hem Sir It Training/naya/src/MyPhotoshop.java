
import java.util.EnumSet;
import java.util.Date;
/**
 * Created by madhu on 5/18/2017.
 */
public class MyPhotoshop {
    public static void main(String [] args){Circle circle=new Circle(5,new Point(2,3));
        circle.Draw();
        circle.fillcolor(Enum.RED);
        for(Enum x: EnumSet.range(Enum.YELLOW,Enum.BLACk))
            System.out.println(x);
        System.out.println(circle.area());
        Rectangle rectangle=new Rectangle(2,4,new Point(2,3),new Point(4,3),new Point(6,3),new Point(11,3));
        System.out.println(rectangle.area());
        System.out.println(new Date());
    }

}
