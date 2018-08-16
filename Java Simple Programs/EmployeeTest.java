public class EmployeeTest{
	public static void main(String [] args)
	{
       Employee emp1=new Employee("Prakash Cityzen");
       Employee emp2=new Employee("aguero");
       emp1.empAge(22);
       emp1.empPosition("owner ");
       emp1.empSalary(1000000);
       emp1.displayEmployee();

       emp2.empAge(26);
       emp2.empPosition("Player ");
       emp2.empSalary(10000);
       emp2.displayEmployee();
	}
}