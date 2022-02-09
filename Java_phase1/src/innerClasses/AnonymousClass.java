package innerClasses;

abstract class AnonymousInnerClass 
{
	   public abstract void display();
}

public class AnonymousClass {
	public static void main(String[] args)
	{
	AnonymousInnerClass i = new AnonymousInnerClass() 
			{
	public void display() 
			         {
			            System.out.println("This is Anonymous Inner Class");
			         }
			      };
			      i.display();
			   }
			}
