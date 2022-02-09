package collections;

import java.util.*;

public class Hashset {
	public static void main(String[] args) 
	{
	  System.out.println("HashSet");
      HashSet<Integer> set=new HashSet<Integer>();  
      set.add(101);  
      set.add(103);  
      set.add(102);
      set.add(104);
      System.out.println(set);  	
      set.remove(103);
      System.out.println(set);  
	}
}

