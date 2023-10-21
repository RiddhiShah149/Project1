package a;

public class Practice1 {

		private int ID;
		private String Name;
		private float Salary;
		
		public int getID() {
			return ID;
		}
		public void setID(int id) {
			ID=id;
		}
		public String getName() {
			return Name;
		}
					
		public void Setname(String name) {
				Name= name;
			}
		public float getSalary() {
			return Salary;
		}
		public void setSalary(float  salary) {
				Salary=salary;
			}
		public Practice1() {
			
		}
		public static void main(String[] args) {
			Practice1 p=new Practice1();
			p.setID(5);
			p.Setname("Riddhi Jimit SHah");
			p.setSalary(50000);
			System.out.println(p.getID());
			System.out.println(p.getName());
			System.out.println(p.getSalary());
		
		
		}
	
		
		

	}


