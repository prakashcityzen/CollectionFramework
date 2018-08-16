/*public class Practice {
    Practice()
    {
        this(0);
        System.out.println("HI");
    }
    Practice(int x)
    {
        this(0,0);

        System.out.println("hello");
    }
    Practice(int x ,int y)
    {
        System.out.println("how are you");
    }*/
    class A {
    static int i = 10;

    static {
        i = i++ + ++i;
        System.out.println("value is "+i);
    }

    public static void main(String args[]) {
//Practice obj=new Practice();    }
A a =new A();
        System.out.println(a.i);
    }
}