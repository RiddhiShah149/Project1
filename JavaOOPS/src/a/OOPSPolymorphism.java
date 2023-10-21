package a;
public class OOPSPolymorphism
{
	
	public static void main(String args[])
	{
		Circle c=new Circle();
	
		String S=c.draw(5, "Green");
		c.draw();         
		float cc=c.draw(5);
		
	}
	
	
}
 class Circle
{
	public int draw()
	{
		System.out.println("Drwaing circle with default color Black and diameter 1 cm.");
		return 5;
	}
	
	public float draw(int diameter)
	{
		System.out.println("Drwaing circle with default color Black and diameter"+diameter+" cm.");
		return 5.0f;
	}
	
	public String draw(int diameter, String color)
	{
		System.out.println("Drwaing circle with color"+color+" and diameter"+diameter+" cm.");
		return "Five";
	}
	
	

	
	
}
