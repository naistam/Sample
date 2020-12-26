class Dog
{
	void eat()
	{
	System.out.println("eating...");
	}
}
class Cat extends Dog
{
	void eat()
	{
	System.out.println("meow is eating");
	}
}
class TestPoly extends Cat
{
	public static void main(String args[])
	{
	Dog c=new TestPoly();
	c.eat();
	}
}