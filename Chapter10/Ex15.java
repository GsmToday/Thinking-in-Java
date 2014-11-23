package Innerclass;

class Book1{
	private String label;
	Book1(String label){
		Prt.prt("Father constructor");
		this.label = label;
	}
	public void f(){
		System.out.println("i dont tell you");
	}
}
class Reader{
	private String name;
	public Book1 book(final String bookname){
		return new Book1(bookname){
			private String label;				
				//Prt.prt("inner class");
				public void f(){
					Prt.prt("Inner f");
				}
			
		};
	}
}
public class Ex15 {
	public static void main(String[] args) {
		Reader reader = new Reader();	
		Book1 fiction = reader.book("before midnight");
		fiction.f();
	}

}
