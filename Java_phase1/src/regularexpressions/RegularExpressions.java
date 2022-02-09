package regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
	public static void main(String[] args) {

		String pattern = "[A-Z]+";
		String check = "Sahith Kumar";
		Pattern ptr = Pattern.compile(pattern);
		Matcher mtc = ptr.matcher(check);
		
		while (mtc.find())
	      	System.out.println( check.substring( mtc.start(), mtc.end() ) );
		}

}
