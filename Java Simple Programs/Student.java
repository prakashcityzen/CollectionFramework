public class Student{
	

		public void add(int a,int b)
		{
        System.out.println("result is :"+(a+b));
		}
		public void add(double a,double b)
		{
        System.out.println("result is :"+(a+b));
		}
		public void add(String a,String b)
		{
        System.out.println("result is :"+(a+b));
		}

		public static void main(String []args)
	{
		Student obj=new Student();
		obj.add(5,5);
obj.add(5.5,5.5);//by default double hunxa
		obj.add("prakash","cityzen");

	}
}
