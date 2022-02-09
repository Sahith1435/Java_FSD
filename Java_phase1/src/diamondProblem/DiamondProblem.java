package diamondProblem;

//This is type of Multiple Inheritance in Java
interface Problem1
{
	public default void display()
	{
		System.out.println("This is the Display method of Problem1");
	}
}

interface Problem2
{
	public default void display()
	{
		System.out.println("This is the Display method of Problem1");
	}
}
public class DiamondProblem implements Problem1,Problem2 {
	
	public void display()
	{
		Problem1.super.display();
		Problem2.super.display();
	}
public static void main(String args[])
	{
	DiamondProblem obj = new DiamondProblem();
	obj.display();
	}
}

