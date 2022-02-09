package keywords;

public class ThrowKeyword {
	public static void main(String[] args)
    {
	int a=45,b=0,c;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero"));
            else
            {
                c = a / b;
                System.out.print("\nThe result is : " + c);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("Error : " + Ex.getMessage());
        }

        System.out.print("\nCan't execute as there is error");
    }

}
