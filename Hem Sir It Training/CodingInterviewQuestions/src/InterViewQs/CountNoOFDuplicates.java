package InterViewQs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountNoOFDuplicates {

    private static void displayDuplicates(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char characters[] = str.toCharArray();
        //loopthrough each characters in array
        for (char c : characters) {
            if (!map.containsKey(c)) {//checking in hashmap
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
            Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
            for (Map.Entry<Character, Integer> entry : entrySet) {
                if (entry.getValue() > 1) {
                    System.out.printf("%s: %d %n", entry.getKey(), entry.getValue());
                }
            }

    }
        public static void main(String arg[])
        {
            String s = "PRAKASH";
            displayDuplicates(s);

        }
}
