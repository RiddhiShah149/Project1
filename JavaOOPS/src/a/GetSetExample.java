package a;

public class GetSetExample {
	private int ID;
	private String Name;
	private Float Salary ;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Float getSalary() {
		return Salary;
	}
	public void setSalary(Float salary) {
		Salary = salary;
	}
	public GetSetExample() {		
	}
	public static void main(String[] args) {
		GetSetExample e =new GetSetExample();
		e.setID(1);
		e.setName("Riddhi Jimit Shah");
		e.setSalary(50000.0F);
		System.out.println(e.getName());
		System.out.println(e.getID());
		System.out.println(e.getSalary());		
	}}

