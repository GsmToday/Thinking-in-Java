package containerindepth;
import java.util.*;
public class ToDoList extends PriorityQueue<ToDoList.ToDoItem>{
	static class ToDoItem implements Comparable<ToDoItem>{
		private char primary;
		private int secondary;
		private String item;
		public ToDoItem(String td, char pri, int sec){
			this.primary = pri;
			this.secondary = sec;
			this.item = td;
		}
		public int compareTo(ToDoItem arg){
			if(this.primary > arg.primary){
				return +1;
			}
			if(this.primary == arg.primary){
				return 0;
			}
			else return -1;
		}
		public String toString(){
			return Character.toString(primary)+" "+this.secondary+" "+item;
		}
	}
	public void add(String td, char pri, int sec){
		super.add(new ToDoItem(td, pri, sec));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
