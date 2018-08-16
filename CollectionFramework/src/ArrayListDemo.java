import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String args[]) {
        java.util.ArrayList<Integer> number = new java.util.ArrayList<Integer>();
        //addinng
        number.add(10);
        number.add(20);
        number.add(200);
        //retrieving
    System.out.println(number.get(0));
    //indexedd for loop
        for(int i=0;i<number.size();i++)
        {
            System.out.println(number.get(i));

        }
        //removing items
        number.remove(number.size()-1);
        //thus is slow
        number.remove(0);
        System.out.println("2nd iteration");
        for(Integer values:number) {

        System.out.println(values);
        }
        //list interface
        List<String> list=new java.util.ArrayList<String>();
    }

}
