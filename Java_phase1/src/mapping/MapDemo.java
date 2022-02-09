package mapping;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args)
	{
//Hashmap
		HashMap<Integer,String> HM=new HashMap<Integer,String>();  
		
		HM.put(1,"Bob");    
		HM.put(2,"Bruce");    
		HM.put(3,"Bravo");   
	       
	      System.out.println("The elements of Hashmap are: ");  
	      for(Map.Entry m:HM.entrySet())
	      {    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
//HashTable
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Alekhya");  
	      ht.put(5,"Rosy");  
	      ht.put(6,"Jack");  
	
	      System.out.println("\nThe elements of HashTable are: ");  
	      for(Map.Entry n:ht.entrySet())
	      {    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
//TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();   
	      
	      map.put(8,"Amani");    
	      map.put(9,"Chitra");    
	      map.put(10,"Cathie");       
	      
	      System.out.println("\nThe elements of TreeMap are: ");  
	      for(Map.Entry l:map.entrySet())
	      {    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  

}
