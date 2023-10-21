package a;


	class Animal {
		   public void move() {
		      System.out.println("Animals can move");
		   }
		   
		   private void secret()
		   {
			 System.out.println("This is Priavte Method can not be overridden"); 
			   
		   }
		   
		   protected void notthatsecret()
		   {
			 System.out.println("This is Protected Method can be called by it subclasses"); 
			   
		   }
		}

		class Dog extends Animal {
		   public void move() {
		      System.out.println("Dogs can walk and run");
		   }
		   
		   public void bark() {
			      System.out.println("Dogs can bark");
			   }
		}

		public class MethodOverriding {

		   public static void main(String args[]) {
		      Animal a = new Animal();   // Animal reference and object
		      Animal b = new Dog(); 
		      Dog d= new Dog();// Animal reference but Dog object

		      a.move();   // runs the method in Animal class
		      b.move(); 
		      d.move();// runs the method in Dog class
		      d.bark();
		     // d.secret(); will give error since it is private in parent
		      d.notthatsecret();
		   
		   }
		}

