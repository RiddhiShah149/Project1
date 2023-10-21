package a;

public class Circle2 {

	public static void main(String[] args) {
		Circle2 c=new Circle2();
		//String S=c.write(5,"Green");//with string type
		//c.write();//same method without parameter
	//	float cc=c.write(5);//with float type
		
	}

}
class Circle3{
	public int paint() {
		System.out.println("Drwaing circle by diameter is 1");
		return 5;
	}
	public String paint(int diameter,int colour) {
		System.out.println("painting cicle with colour black");
		return "five";
	}
	public float paint(int diameter) {
		
		System.out.println("Painting circle");
		return 5.0f;
	}
	
}
