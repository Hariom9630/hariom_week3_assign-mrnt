class Vehicle
{
void Engine(){		
System.out.println("Vehicle Engine");
}

}
class Car extends Vehicle
{
	void Engine ()
	{
		System.out.println("Car Engine ");
	}
}
class Bike extends Vehicle
{
	void Engine()
	{
		System.out.println("Bike Engine");
	}
}

class Demo
{
	public static void main (String ar[])
	{
		Vehicle v=new Vehicle();
		v.Engine();
		
		Car c=new Car();
		c.Engine();
		
		Bike b=new Bike();
		b.Engine();
		
	}
}