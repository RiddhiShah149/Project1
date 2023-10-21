package a;

public class Animal2 {
	public void move() {
		System.out.println("Animal can move");
	}
	private  void secret() {
		System.out.println("This is private method not accessable");
	}
	protected void notsecret() {
		System.out.println("this is protected method only accessable with subclass object");
	}
}
	class cat extends Animal2{// child classbextends parent class
		public void move() {// child class having same method move
			System.out.println("Dogs can walk and run");
		}
	
	public void bark() {
		System.out.println("dog can bark");
	}
	
	
	public class MethodOverridding{

	public static void main(String[] args) {
		Animal2 a=new Animal2();//parent class object
		 cat d= new cat();// child class object
		Animal2 ab=new cat();//Animal reference with Dog class object
		
		a.move();
		d.bark();
		ab.move();
		//d.secret();//private not acceassable
		d.notsecret();
		d.move();
		
		

	}

}}
