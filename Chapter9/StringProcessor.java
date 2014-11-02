package interface9;

import java.util.Arrays;
/*
class Processor{
	// 返回类的名字
	public String name(){
		return getClass().getSimpleName();
	}
	// Process 处理方法
	Object process(Object input){
		return input;
	}
}
*/
class Apply {
	//创建一个根据所传递的参数的不同， 而具有不同行为的方法 -- 策略设计模式
	public static void Applyprocess(Processor p, Object s){
		Prt.prt("Using Processor " + p.name());
		System.out.println(p.process(s));
	}
}
//复用代码的第一种方式： 
//客户端程序员遵循该接口来编写他们自己的类。

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
	// Process 处理方法
	public String process(Object input){
		return ((String)input).toUpperCase();
	}
}

class Downcase extends StringProcessor{
	// Process 处理方法
	public String process(Object input){
		return ((String)input).toLowerCase();
	}
}

class Splitter extends StringProcessor {
	// Process 处理方法
	public String process(Object input){
		return Arrays.toString(((String)input).split(" "));//分割函数
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

