package String;

import java.util.*;
import java.util.regex.*;

public class Group {
	 static public final String POEM =
		    "Twas brillig, and the slithy toves\n" +
		    "Did gyre and gimble in the wabe.\n" +
		    "All mimsy were the borogoves,\n" +
		    "And the mome raths outgrabe.\n\n" +
		    "Beware the Jabberwock, my son,\n" +
		    "The jaws that bite, the claws that catch.\n" +
		    "Beware the Jubjub bird, and shun\n" +
		    "The frumious Bandersnatch.";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Set<String> words = new HashSet<String>();
		
		 Matcher m =
		      //Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$")
			 Pattern.compile("\\b[a-z]\\w*")
		        .matcher(POEM);
		 
		    while(m.find()) {		  
		    	words.add(m.group(0));
		    	}
		    System.out.println(words.size());
	}
}
