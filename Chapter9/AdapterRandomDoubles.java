//适配接口

package interface9;

import java.nio.*;
import java.util.*;

class RandomDoubles {
	private static Random rand = new Random(47);

	public double next(){
		return rand.nextDouble();
	}
}

public class AdapterRandomDoubles implements Readable{
	private RandomDoubles r;
	private int count = 7;
	public AdapterRandomDoubles(RandomDoubles r){
		this.r = r;
	}
	public int read(CharBuffer cb){	
		if(count-- == 0)
		{
			return -1;
		}
		String result = Double.toString( r.next() ) + " ";
		cb.append(result);
		return result.length();	
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(new AdapterRandomDoubles(new RandomDoubles()));
		//每当s.hasNext()的时候，readable.read()就会被调用，
		//对于hasNext是否继续读下去和是否返回真值，是分开的，如果read()返回不是-1，那么将继续读下去，
		while(s.hasNextDouble()){
			System.out.println(s.nextDouble());
		}
	}
}
