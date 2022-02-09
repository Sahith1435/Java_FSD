package strings;

public class StringOps {
	public static void main(String[] args) {
		
		System.out.println("String Buffer is as follows:");
		
	//Creating StringBuffer and append method
		StringBuffer sb=new StringBuffer("I play Cricket");
		sb.append(",I play Volleyball too");
		System.out.println(sb);

	//insert method
		sb.insert(0, '-');
		System.out.println(sb);

	//replace method
		StringBuffer sbf=new StringBuffer("Reverse");
		sbf.replace(2,5, "sv");
		System.out.println(sbf);

	//Delete method
		sbf.delete(0,2);
		System.out.println(sbf);
		
		System.out.println("\n");
		
	//StringBuilder
		
		System.out.println("String Builder demonstrastion is as follows:");
		StringBuilder sb1=new StringBuilder("Sahith");
		sb1.append("kumar");
		
		System.out.println(sb1);

		System.out.println(sb1.delete(0,7));

		System.out.println(sb1.insert(1, "Invalid"));

		System.out.println(sb1.reverse());
		
		System.out.println("\n");
				
	//Conversion Concept	

		System.out.println("Converting Strings to StringBuffer&StringBuilder");
		
		String str = "Hello"; 
	    
	// conversion from String object to StringBuffer 
	    StringBuffer sbr = new StringBuffer(str); 
	    sbr.reverse(); 
	    System.out.println("String to StringBuffer");
	    System.out.println(sbr); 
	      
	// conversion from String object to StringBuilder 
	    StringBuilder sb2 = new StringBuilder(str); 
	    sb2.append("world"); 
	    System.out.println("String to StringBuilder");
	    System.out.println(sb2);              		
		}

}
