/**
 * For interface,
 * Chapter 9 in Thinking in Java
 * Practice 16
 */
package interface9;

import java.nio.*;
import java.util.*;
class charList{
	private static char[] list = "this is a char array".toCharArray();
	public char[] next(){
		return list;
	}
}

public class AdapterCharList implements Readable{
	private charList c;
	private int count = 1;
	AdapterCharList(charList c){
		this.c = c;
	}
	public int read(CharBuffer cb){
		if(count-- == 0)
			return -1;
		char[] result = c.next();
		for(int i=0; i<c.next().length; i++)
		{	
			//System.out.println(result[i]);
			cb.append(result[i]);
		}
		return cb.length();
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(new AdapterCharList(new charList()));
		while(s.hasNext()){
			System.out.println(s.next());
		}
	}
}