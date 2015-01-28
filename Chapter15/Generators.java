package generics;

import java.util.*;
import generics.coffee.*;
import generics.character.*;
public class Generators {
	public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n){
		for(int i =0;i<n;i++)
		{
			coll.add(gen.next());
		}
		return coll;
	}
	
	public static <T> Collection<T> fill(List<T> coll, Generator<T> gen, int n){
		for(int i =0;i<n;i++)
		{
			coll.add(gen.next());
		}
		return coll;
	}
	public static <T> Collection<T> fill(LinkedList<T> coll, Generator<T> gen, int n){
		for(int i =0;i<n;i++)
		{
			coll.add(gen.next());
		}
		return coll;
	}
	public static <T> Collection<T> fill(Queue<T> coll, Generator<T> gen, int n){
		for(int i =0;i<n;i++)
		{
			coll.add(gen.next());
		}
		return coll;
	}
	 public static void main(String[] args) {
		 Collection<Coffee> coffee = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
		 System.out.println(coffee.getClass());	
	 
	 	Collection<Coffee> coffee2 = fill(new LinkedList<Coffee>(), new CoffeeGenerator(), 4);
	 	System.out.println(coffee2.getClass());
	 	//Queueǿ������ת����Queue�ǽӿڲ�������ʵ��������Linkedlistͬʱʵ��List��Queue��
	 	Collection<Coffee> coffee3 = fill((Queue<Coffee>) new LinkedList<Coffee>(), new CoffeeGenerator(), 4);
	 	System.out.println(coffee3.getClass());
	 }
}
