package emailValidation;

import java.util.Scanner;
import java.util.*;

public class EmailValidation {
	public static void main(String[] args){
		
	    System.out.println("Enter your email id:");
	    String[] strings = {"sahith@abc.com","vijay@xyz.com","vamshi@pqr.com","vineeth@cba.com","prani@zyx.com"};;
	   
	    try (Scanner sc = new Scanner(System.in)) {
			String pq=sc.next();
			
			String toFind= pq;

		boolean found = Arrays.stream(strings).anyMatch(a -> a.equals(toFind));
			
			    if(found)
			        System.out.println("Email Authencticated \nWelcome..."+pq);
			    
			    else
			      System.out.println("Invalid email.\n Access Denied");
		}
}
}
