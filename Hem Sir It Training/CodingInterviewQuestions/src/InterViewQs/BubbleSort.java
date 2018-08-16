package InterViewQs;

public class BubbleSort {
    public static void main(String arg[]) {
        int []intArray = {9, 8, 7,5,6};
        System.out.println("Before sorting print the element");
        for (int i : intArray) {
            System.out.println(i);
        }
        bubbleSort(intArray);
        System.out.println("After sorting print the element");
        for (int i : intArray) {
            System.out.println(i);
        }
    }
    private static void bubbleSort(int[] intArray)
    {
        int temp=0;
   for (int i = 0; i< intArray.length; i++)
   {
       for(int j = 1; j<(intArray.length)-i; j++)
       {
        if(intArray[j-1]> intArray[j])//swap elements
             {
                 temp= intArray[j-1];
                 intArray[j-1]= intArray[j];
                 intArray[j]=temp;
             }
       }
       }
       }
}