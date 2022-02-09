package innerClasses;

public class InnerClass2 {
	private String info="Ashish is a Sports person"; 
	
	class Inner
		{  
		  void Ashish()
		  {System.out.println(info+",He likes to play Cricket");}  
		 }  
	public static void main(String[] args) 
		{
			InnerClass1 obj=new InnerClass1();
			InnerClass1.Inner in=obj.new Inner();  
			in.Ashish();  
		}

}
