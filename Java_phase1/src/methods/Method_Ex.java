package methods;

public class Method_Ex {
	public int Addnumbers(int a,int b) 
	{
		int z=a+b;
		return z;
	}

public static void main(String[] args) 
	{
		Method_Ex c = new Method_Ex();
		int res= c.Addnumbers(9,3);
		System.out.println("Addition is:"+res);
	}
}
