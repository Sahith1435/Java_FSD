package oopsConcepts;
//This Program demonstrates Polymorphism
public class Addition {
	  public int sum(int x, int y) 
	    { 
	        return (x + y); 
	    } 
	    public int sum(int x, int y, int z) 
	    { 
	        return (x + y + z); 
	    } 
	    public double sum(double x, double y) 
	    { 
	        return (x + y); 
	    } 
	    public static void main(String args[]) 
	    { 
	        Addition A = new Addition(); 
	        System.out.println(A.sum(100, 20)); 
	        System.out.println(A.sum(100, 250, 390)); 
	        System.out.println(A.sum(10.5, 20.5)); 
	    } 

}
