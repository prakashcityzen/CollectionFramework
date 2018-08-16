import java.util.Scanner;
 

 //Java Program to Make a Simple Calculator using Switch Statement

public class Calculator {
    public static void main(String[] args)
    {
        int a, b;
char c;
 
        Scanner sc = new Scanner(System.in);

        // Take two numbers as input from user
        System.out.println("Enter Two Integers");
        a = sc.nextInt();
        b = sc.nextInt();
 
        // Taking operator as input from user
        System.out.println("Enter an choice from 1 to 4 ");
        c=sc.next().charAt(0);
 
        switch (c) {
        case '1' :
            System.out.println( a + b);
            break;
        case '2':
            System.out.println(a - b);
            break;
        case '3':
            System.out.println( a * b);
            break;
        case '4':
            System.out.println( a / b);
            break;
        default:
            System.out.println("Operation inavalid");
        }
    }
}
