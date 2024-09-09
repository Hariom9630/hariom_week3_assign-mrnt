class Shape
{
	void area()
	{
		
	}
}
class Circle extends Shape
{
	void area(double r)
	{
		System.out.println("the area is="+( 3.147*r*r));
	}
}
class Triangle extends Shape
{
	void area(double b,double h)
	{
		System.out.println("the area is="+( 0.5*b*h));
	}
	
}
class Rectangle extends Shape
{
	void area(double w,double h)
	{
		System.out.println("the area is="+( w*h));
	}
}

class Demo{
	public static void main (String ar[])
	{
		Circle c=new Circle();
		c.area(10);
		
		Triangle t=new Triangle();
	     t.area(10,20);
		 
		 Rectangle r=new Rectangle();
		 r.area(10,20);
	}
}