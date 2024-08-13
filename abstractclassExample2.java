package AbstractionConcepts;

abstract class Vehicle
{
	abstract String microprocesor();
	void steering()
	{
		System.out.println("Steering can be controlled");
	}
	abstract String  internalsensor();
	void brake()
	{
		System.out.println("brakes can be controlled");
	}
	void clutch()
	{
		System.out.println("clutch can be controlled");
	}
	
}

class Car extends Vehicle
{
	String microprocesor()
	{
		return "Microprocessor 8085";
	}
	
	String internalsensor()
	{
		return "sensor-ideaforge";
	}
}

class Truck extends Vehicle
{
	String microprocesor()
	{
		return "Microprocessor 8088";
	}
	
	String internalsensor()
	{
		return "sensor-bharatforge";
	}
	
	
}

public class abstractclassExample2 {

	public static void main(String[] args) {
		
		Vehicle ref1=new Car();
		Vehicle ref2=new Truck();
		
	System.out.println(ref1.microprocesor());	
	System.out.println(	ref2.microprocesor());
		ref1.clutch();
		ref2.brake();
		ref1.steering();
		
		
		

	}

}
