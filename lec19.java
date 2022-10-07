package lec;
class lec18{
	String name;
	String employeer;
	int salary;
	public lec18(String name, String employeer, int salary) {
		this.name = name;
		this.employeer = employeer;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public String getEmployeer() {
		return employeer;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "the assholes names is "+getName()+"andd his salary is "+getSalary()+"plus his employeer is "+getEmployeer();
	}
	
	
}
public class lec19 {
	public static void main(String[] args) {
		
	
 lec18 obj=new lec18("shashamk","srinivas", 19000);
 System.out.println(obj.toString());
 
	}
}
