

//creating a employee class
class Employee{
	//Attributes
	String name;
	String id;
	int salary;
	
	//Constructor
	
	Capgemini(String name, String id, int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void displayDetails(){
	    System.out.println("Name: " + name + " his employee id: " + id + " and his salary is: "+ salary);
	}
}
    public static void main(String []args){
		Employee employee1 = new Employee("Virat Kohli", "011CaP09", 40000);
		System.out.println(employee1.displayDetails());
	}