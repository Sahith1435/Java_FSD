package typecasting;

public class TypeCasting {
public static void main(String[] args) {
		
		//Implicit TypeCasting
	
		System.out.println("Implicit TypeCasting is as follows:");
		
		char a='R';
		System.out.println("Value of a: "+a);
		
		int b=a;
		System.out.println("Value of b: "+b);
		
		float c=b;
		System.out.println("Value of c: "+c);
		
		long d=a;
		System.out.println("Value of d: "+d);
			
		System.out.println("\n");
		
		//Explicit TypeCasting
		
		System.out.println("Explicit TypeCasting is as follows:");
			
		double x=69.99;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
	}

}
