/**
 * For �ڲ������ӵ��ⲿ��
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
		{	//��sequence �����string����
			sequence.add(new Ex02(Integer.toString(i)+" "));
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
