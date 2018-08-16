import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by madhu on 5/21/2017.
 */
public class Car implements Engine{
    @Override
    public void brakefail() {
        System.out.println("mara aba");
    }

    @Override
    public void startEngine() {
        System.out.println("k xa hau");
    }

    @Override
    public void stopEngine() {
        System.out.println("garo xa jindagi");

    }
}
