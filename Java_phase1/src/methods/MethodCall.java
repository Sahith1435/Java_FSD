package methods;

public class MethodCall {

	int A=100;

	int operation(int A) 
	{
		A =A*10/100;
		return(A);
	}

	public static void main(String args[]) 
	{
		MethodCall d = new MethodCall();
		System.out.println("Before operation value of data is "+d.A);
		
		d.operation(50);
		System.out.println("After operation value of data is "+d.A);
	}
}
