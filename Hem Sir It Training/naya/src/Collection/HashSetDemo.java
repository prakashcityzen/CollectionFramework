package Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;


/**
 * Created by madhu on 5/24/2017.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> names=new LinkedHashSet<>();
        names.add("madhu");
        names.add("bbk");
        System.out.println(names);
        names.add("bbk");
        System.out.println(names);
        for(String x:names)
            System.out.println(x);
    }
}
