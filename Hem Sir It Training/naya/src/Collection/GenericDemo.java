package Collection;

/**
 * Created by madhu on 5/24/2017.
 */
public class GenericDemo {
    public static void printArrays(int [] roll){
        for(int r:roll)
            System.out.println(r);
    }
    public static void printStringArrays(String [] x){
        for(String name:x)
            System.out.println(name);
    }
    public static <E> void printArrays(E [] arrays){
        for(E e:arrays)
            System.out.println(e);
    }

    public static void main(String[] args) {
        /*Integer [] roll=new Integer[]{1,2,3,4,5};
        String [] names={"madhu","bibek"};
        GenericDemo.printArrays(roll);
        GenericDemo.printArrays(names);*/
        Box<User> userBox= new Box<>();
        userBox.setItem(new User());
        userBox.setItem(new User());
        User user=userBox.getItem();

    }
}
