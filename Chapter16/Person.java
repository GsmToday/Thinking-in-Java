//实现Comparable接口的抽象方法，定义排序规则
package Arrays;
import java.util.*;
public class Person implements Comparable{
	private final int id;
	private String name;
	private int age;
	public Person(int id, String name, int age){
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public String getName() {  
	        return name;  
	    }  
	public void setName(String name) {  
	        this.name = name;  
	    }  
	public int getAge() {  
	        return age;  
	    }  
	public void setAge(int age) {  
	        this.age = age;  
	}
	public int getId() {  
	        return id;  
	    }  
    public String toString(){  
        return "Id:" + id + "/tName:" + name + "/tAge:" + age;  
    }
    //实现Comparable接口的抽象方法，定义排序规则
    public int compareTo(Object o){
    	Person per = (Person)o;
    	return this.id - per.id;
    }
	public static void main(String[] args) {
		TreeSet tree = new TreeSet();  
        tree.add(new Person(1,"小名",15));  
        tree.add(new Person(4,"小刚",16));  
        tree.add(new Person(3,"小花",17));  
        tree.add(new Person(2,"金刚",100));  
        for(Object o : tree){
        	Prt.prt(""+o);
        }
	}

}
