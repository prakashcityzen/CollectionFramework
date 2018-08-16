package InterViewQs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {


    public static String removeDuplicates(String str) {
        Set<Character> set = new HashSet<>();
        StringBuffer sf = new StringBuffer();
//for loop for extracting all characters

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);//str.chartAt(0)-->P
            if (!set.contains(ch)) {//if P is not present in hashset
                set.add(ch);//add s to set
                sf.append(ch);//P
            }
        }
        return sf.toString();
    }
    public static void  main(String arg[])
    {
        String s="PRAKASH";
        System.out.println(removeDuplicates(s));

    }
}
