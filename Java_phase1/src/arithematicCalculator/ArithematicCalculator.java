package arithematicCalculator;

import java.util.Scanner;

public class ArithematicCalculator {
	public static void main(String[] args)
	{
		
		int num1,num2,input;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		num1=sc.nextInt();
		
		System.out.println("Enter the second number:");
		num2=sc.nextInt();
		
		System.out.println("Choose the operation required  : 1.Addition 2.Substarction 3.Multiplication 4.Division ");
		input=sc.nextInt();
		
		if(input==1)
			System.out.println("Addition of given numbers:"+(num1+num2));
		
		else if(input==2)
			System.out.println("Substraction of given numbers:"+(num1-num2));
		
		else if(input==3)
			System.out.println("Multiplcation of given numbers:"+(num1*num2));
		
		else if(input==4)
			System.out.println("Divison of given numbers:"+(num1/num2));
	}
}

