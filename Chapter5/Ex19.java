/**
 * For array initialization �ɱ�����б�
 * Chapter 5 in Thinking in Java
 * Practice 19
 */
package initializationandcleanup;

public class Ex19 {
	static void f(String ... args){
		for(String s : args)
		{
			System.out.println(""+s);
		}
		
	}
	public static void main(String[] args) {
		//ָ��Ԫ���б�󣬱��������Զ����Ϊ����
		f("I","am", "GSM");
		// ֱ�Ӵ�������
		f(new String[] {"am", "GSM"});
	}

}
