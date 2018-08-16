public class Employee{
	String name;
	int age;
	String position;
	double salary;
	public Employee(String name )
	{
		this.name=name;

	}
	public void empAge(int empAge)//instance method 
	{
		age=empAge;
	}
public void empPosition(String empPosition)	{
	position=empPosition;

}
public void empSalary(double empSalary){
	salary=empSalary;
}
public void displayEmployee()
{
	System.out.println("name"+name);
	System.out.println("age"+age);
	System.out.println("position"+position);
	System.out.println("salary"+salary);
}
}