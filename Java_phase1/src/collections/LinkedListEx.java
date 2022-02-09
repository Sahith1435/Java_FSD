package collections;

import java.util.*;

public class LinkedListEx {

	public static void main(String[] args) 
	{
		
	System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();    
	      names.add("Nani");  
	      names.add("Nivetha"); 
	      System.out.println(names);
//Using Iterator
	      System.out.println("Using Iterator");
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext())
	      {  
	       System.out.println(itr.next());  
	       }
	}
}
