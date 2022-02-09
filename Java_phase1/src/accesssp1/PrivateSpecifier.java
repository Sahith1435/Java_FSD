package accesssp1;

public class PrivateSpecifier {
	private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
 
public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		PrivateSpecifier  obj = new PrivateSpecifier(); 
        //trying to access private method of another class 
        //obj.display();

	}
}
