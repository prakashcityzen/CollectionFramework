import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void  main(String args[])
    {
       /* //hashset dont maintain order
        java.util.Set<String> set=new HashSet<String>();
        //so use linkedHashset to maintain order
        java.util.Set<String> linkedHashSet=new LinkedHashSet<String>();*/
        //treemap sorts in natural order
        java.util.Set<String> set=new TreeSet<String>();
        set.add("Aguero");
        set.add("Silva");
        set.add("KDB");
        //adding duplicates
        set.add("KDB");
        System.out.println(set);
        //iteration through set
        for(String element:set)
        {
            System.out.println(element);
        }
        //the data set contains a given item
           if(set.contains("yaya"))
           {
               System.out.println("Contains yaya ");
           }
           else
               System.out.println("doesnt contain yaya");
        //Intersection
        java.util.Set<String> set1=new TreeSet<String>();
        set1.add("Aguero");
        set1.add("Silvaa");
        set1.add("KDB");
        //adding duplicates
        set1.add("KDB");
        java.util.Set<String> intersection=new HashSet<String>(set);//copy banako set one ko using constructor
        intersection.retainAll(set1);//slects only commmon elememnt of both sets
        System.out.println(intersection);
//different
        java.util.Set<String> differnce=new HashSet<String>(set);//copy banako set one ko using constructor
       differnce.removeAll(set1);//element in set1 not in set2
        //differnce.removeAll(set);//element in set1 not in set2

        System.out.println(differnce);
    }
}


