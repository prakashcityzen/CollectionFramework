class  Parent{
	
	void myMethod()
	{
		System.out.println("parent class constructor ");

	}
}
	 class Child extends Parent{
        
		void myMethod()
		{
			super.myMethod();
			System.out.println("child class method ");
		}
	
	public static void  main(String [] args)
	{
      Child c=new Child();
      c.myMethod();
      }
      }


	 
