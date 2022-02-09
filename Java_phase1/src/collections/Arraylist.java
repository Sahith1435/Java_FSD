package collections;

import java.util.*;

public class Arraylist {
	public static void main(String[] args) 
	{

	System.out.println("ArrayList");
	
			ArrayList<String> Friends=new ArrayList<String>();   
			
		      Friends.add("Rohith");
		      Friends.add("Sreevani");    	 
		      Friends.add("Sruthi");
		      
		      System.out.println(Friends);  
		      
		      Friends.remove("Sruthi");
		      
		      System.out.println(Friends);

	}
}