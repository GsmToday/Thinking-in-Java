/**
 * For 内部类链接到外部类
 * Chapter 10 in Thinking in Java
 * Practice 02
 */
package Innerclass;

public class Ex02 {
	private String s;
	Ex02(String s){
		this.s =s;
	}
	public String toString(){
		return s;
	}
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		
		for(int i=0; i<10;i++)
		{	//向sequence 中添加string对象
			sequence.add(new Ex02(Integer.toString(i)+" "));
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
