//Comparator类
package Arrays;
import java.util.*;

class MyComparator implements Comparator<Student>{
	public int compare(Student stu1, Student stu2){
		if(stu1.getAge() > stu2.getAge()){
			return 1;
		}else if(stu1.getAge() < stu2.getAge())
		{	return -1;
		}else{
			return 0;
		}
	}
}
public class Student {
	private String name;
	private int age;
	
	public Student(String name,int age ){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return "姓名："+this.name+", 年龄："+this.age;
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
	
	public static void main(String[] args) {
		 Student stu[] = {
				 new Student("张三",23)  
				 ,new Student("李四",26)  
         	,new Student("王五",22)};  
		Arrays.sort(stu,new MyComparator());    
	     for (int i = 0; i <stu.length; i++) {  
	            Student s = stu[i];  
	            System.out.println(s);  
	        }
	     
	   List<Student> list = new ArrayList<Student>();  
	   list.add(new Student("zhangsan",31));  
	   list.add(new Student("lisi",30));  
	   list.add(new Student("wangwu",35));  
	   Collections.sort(list,new MyComparator()); 
	   
	   for (int i=0;i<list.size();i++){  
           Student s = list.get(i);  
           System.out.println(s);  
       }  
	}
}

