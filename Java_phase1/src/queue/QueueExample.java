package queue;

import java.util.*;

public class QueueExample {
	public static void main(String[] args) 
	{
	     Queue<String> namesQueue = new LinkedList<>();
	     
	     			namesQueue.add("Seetha");
	        		namesQueue.add("Geetha");
	        		namesQueue.add("Sheela");
	        		namesQueue.add("Maala");
	        		   		
	System.out.println("Queue is : " + namesQueue);
	
	System.out.println("\nHead of Queue : " + namesQueue.peek());
	
					namesQueue.remove();
	
	 System.out.println("\nAfter removing Head of Queue : " + namesQueue);
	 
	 System.out.println("\nSize of Queue : " + namesQueue.size());
	 
	    	}
	}
