package holding;
import java.util.*;
interface Selector{
	boolean end();
	Object current();
	void next();
}

public class Sequence {
	private final List<Object> items = new ArrayList<Object>();
	// �����µ�object
	public void add(Object x){
		items.add(x);
	}
	private class SequenceSelector implements Selector{
		private int i;
		// ����Ƿ�ĩβ��
		public boolean end(){
			return i == items.size() ;
		}
		// ���ص�ǰ����
		public Object current(){
			return items.get(i);
		}
		// �Ƶ������е���һ������
		public void next(){
			if(i < items.size()){
				i++;
			}
		}
	}
	
	public Selector selector(){
		return new SequenceSelector();
	}
	public static void main(String[] args) {
		Sequence sequence = new Sequence();
		
		for(int i=0; i<10;i++)
		{	//��sequence �����string����
			sequence.add(i);
		}
		//ͨ������selector����ڲ������
		Selector selector = sequence.selector();
		// ��selector �ƶ��Լ�ѡ��ÿһ��Ԫ��
		while(!selector.end()){
			System.out.print(selector.current()+"");
			selector.next();
		}

	}

}
