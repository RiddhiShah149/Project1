package a;

class Vehicle {
    int maxSpeed = 120;
    public void whoami()
	    {
	    	System.out.println("I am a Parent Class Vehical");
	    }
    }
 
// sub class Car extending vehicle
class Car extends Vehicle {
    int maxSpeed = 180;
    
   
 
    public void whoami()
    {
        super.whoami();
    	System.out.println("I am a Child Class Car");
    }
    void display()
    {
        // print maxSpeed of base class (vehicle)
        System.out.println("Maximum Speed of vehical: "
                           + super.maxSpeed);
        System.out.println("Maximum Speed of car: "
                + maxSpeed);
    }
}
 
// Driver Program
class superkeyword {
    public static void main(String[] args)
    {
        Car small = new Car();
        small.display();
        small.whoami();
       
 
    }
}