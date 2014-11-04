//����ӿ�

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
		//ÿ��s.hasNext()��ʱ��readable.read()�ͻᱻ���ã�
		//����hasNext�Ƿ��������ȥ���Ƿ񷵻���ֵ���Ƿֿ��ģ����read()���ز���-1����ô����������ȥ��
		while(s.hasNextDouble()){
			System.out.println(s.nextDouble());
		}
	}
}
