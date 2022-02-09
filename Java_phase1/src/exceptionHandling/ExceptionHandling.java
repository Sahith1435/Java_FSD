package exceptionHandling;

class MyException extends Exception{
	
	   String str1;
	   MyException(String str2) 
	   {
		str1=str2;
	   }
public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}
class ExHandling{

public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			
			//Throwing Customized Exception using Throw keyword
			
			throw new MyException("This is My error Message");
		}
		catch(MyException exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
	}

