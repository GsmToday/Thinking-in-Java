package holding;
import java.util.*;
interface Selector{
	boolean end();
	Object current();
	void next();
}

public class Sequence {
	private final List<Object> items = new ArrayList<Object>();
	// 插入新的object
	public void add(Object x){
		items.add(x);
	}
	private class SequenceSelector implements Selector{
		private int i;
		// 检查是否到末尾了
		public boolean end(){
			return i == items.size() ;
		}
		// 返回当前对象
		public Object current(){
			return items.get(i);
		}
		// 移到序列中的下一个对象
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
		{	//向sequence 中添加string对象
			sequence.add(i);
		}
		//通过调用selector获得内部类对象
		Selector selector = sequence.selector();
		// 用selector 移动以及选择每一个元素
		while(!selector.end()){
			System.out.print(selector.current()+"");
			selector.next();
		}

	}

}
