package interface9;

import java.util.Arrays;
/*
class Processor{
	// �����������
	public String name(){
		return getClass().getSimpleName();
	}
	// Process ������
	Object process(Object input){
		return input;
	}
}
*/
class Apply {
	//����һ�����������ݵĲ����Ĳ�ͬ�� �����в�ͬ��Ϊ�ķ��� -- �������ģʽ
	public static void Applyprocess(Processor p, Object s){
		Prt.prt("Using Processor " + p.name());
		System.out.println(p.process(s));
	}
}
//���ô���ĵ�һ�ַ�ʽ�� 
//�ͻ��˳���Ա��ѭ�ýӿ�����д�����Լ����ࡣ

interface Processor{
	String name();
	Object process(Object input);
}

public abstract class StringProcessor implements Processor{
	public String name(){
		return getClass().getName();
	}
	
	public abstract String process(Object input);
	
	public static String s = 
		"If she weighs the same as a duce, she's made of wood";
	public static void main(String[] args) {
		Apply.Applyprocess(new Upcase() , s);
		Apply.Applyprocess(new Downcase() , s);
		Apply.Applyprocess(new Splitter() , s);
	}
}

class Upcase extends StringProcessor{
	// Process ������
	public String process(Object input){
		return ((String)input).toUpperCase();
	}
}

class Downcase extends StringProcessor{
	// Process ������
	public String process(Object input){
		return ((String)input).toLowerCase();
	}
}

class Splitter extends StringProcessor {
	// Process ������
	public String process(Object input){
		return Arrays.toString(((String)input).split(" "));//�ָ��
	}
}

/*
	public static String s = 
		"Disagreement with beliefs is by definition incorrect";
	
	public static void main(String[] args) {
		Applyprocess(new Upcase() , s);
		Applyprocess(new Downcase() , s);
		Applyprocess(new Splitter() , s);
	}
*/

