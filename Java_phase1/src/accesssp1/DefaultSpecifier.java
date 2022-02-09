package accesssp1;

public class DefaultSpecifier {
	 void display() 
     { 
         System.out.println("This demonstrates Defalut Access Specifier"); 
     } 

	public static void main(String[] args) 
	{
		//default access
		System.out.println("Dafault AccessSpecifier");
		DefaultSpecifier obj = new DefaultSpecifier(); 		  
        obj.display(); 
	}

}
