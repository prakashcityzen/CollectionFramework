import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kshitish Pokharel on 5/20/2018 at 9:54 AM.
 */
public class MapText {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"b");
        map.put(2,"xz");
        for(Integer key:map.keySet())
        {
            System.out.println(map.get(key));
        }
    }
}
