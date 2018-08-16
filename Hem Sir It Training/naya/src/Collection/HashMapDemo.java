package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

/**
 * Created by madhu on 5/24/2017.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,User> hm=new HashMap<>();
        User madhu =new User();
        User bbk =new User();
        hm.put("madhu",madhu);
        hm.put("gwach",bbk);
        System.out.println(hm);
        System.out.println(hm.get("madhu"));
        System.out.println(hm.containsKey(5));
        System.out.println(hm.size());
        Iterator iterator=hm.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry entry=(Map.Entry)iterator.next();
            System.out.println("key:" +entry.getKey());
            System.out.println("value:"+entry.getValue());
            System.out.println(hm.isEmpty());
            hm.clear();
            System.out.println(hm.isEmpty());
        }
    }
}
