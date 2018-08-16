//example of constructor overloading 
public class Patient{
	int age;
	String name,address;
	public Patient(){ //default constructor
		
	}
	public Patient(int age,String name,String address){  //parameterized constructor
		this.age=age;
		this.name=name;
		this.address=address;
	}
	public void display(){
		System.out.println("name of patient is:"+name);
		System.out.println("age:"+age);
		System.out.println("address:"+address);
	}
	public static void main(String [] args){
		Patient obj=new Patient(21,"madhu","gulmi");
		obj.display();
		Patient obj1=new Patient(22,"pk","ktm");
		obj1.display();
		Patient obj2=new Patient();
		obj2.display();
	}
}