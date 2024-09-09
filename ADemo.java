abstract class A
{
abstract void demo();
}
interface inter1
{
void demo();
}
class Demo extends A implements inter1
{
 public void demo()
 {
 System.out.println("Override  class ");
 }
}
class ADemo
{
	public static void main (String ar[])
	{
		Demo d=new Demo();
		d.demo();
	}
}