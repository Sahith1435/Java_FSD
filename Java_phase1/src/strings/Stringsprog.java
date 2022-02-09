package strings;

public class Stringsprog {
	public static void main(String[] args) {

		System.out.println("Operations on strings :");
//To define string length	
		String sl=new String("This is a String Program");
		System.out.println(sl.length());

//To generate substring
		String sub=new String("Sahith");
		System.out.println(sub.substring(2));

//To Compare Strings
		String s1="Knife";
		String s2="Knive";
		System.out.println(s1.compareTo(s2));

//To check whether a string is Empty
		String s4="Test";
		System.out.println(s4.isEmpty());

//To convert to LowerCase
		String s5="Capitals";
		System.out.println(s5.toLowerCase());
		
//To replace letters
		String s6="Knive";
		String replace=s6.replace('v', 'f');
		System.out.println(replace);

//to check if equals
		String x="Sahith plays cricket";
		String y="Sahith plays GTA";
		System.out.println(x.equals(y));
 	
	}

}
