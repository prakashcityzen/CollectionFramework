class  Parent{
	
	Parent()
	{
		this(10);
		System.out.println("parent class constructor ");

	}
	Parent(int a)
	{
		this(10,20);
		System.out.println(a);

	}
	Parent(int a,int b)
	{
		
		System.out.println(a+b);

	}
}
	 class ChildImp extends Parent{
        
		ChildImp(){
		super();//automatic compiler le generate garxa 
			System.out.println("child class method ");
		}
	
	public static void  main(String [] args)
	{
      ChildImp c=new ChildImp();
      }
      }


	 
