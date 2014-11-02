/**
 * For interface, two interfaces
 * Chapter 9 in Thinking in Java
 * Practice 10
 */
package interface9;
 interface Instrument2{
	void adjust();
}
 interface Playable{
	 void play(Note n);
	}
class Winds2 implements Instrument2,Playable{
	//子类必须定义父类的抽象类
	public void play(Note n){
		System.out.println(this + ".play()" + n);
	}
	
	public String toString(){
		return "Wind2";
	}
	
	public void adjust(){
		System.out.println(this + ".adjust()");
	}
}
class Percussion2 implements Instrument2,Playable{
	public void play(Note n){
		System.out.println(this + ".play()" + n);
	}
	public String toString(){
		return "Percussion2";
	}
	
	public void adjust(){
		System.out.println(this + ".adjust()");
	}
}

class Stringed2 implements Instrument2,Playable{
	public void play(Note n){
		System.out.println(this + ".play()" + n);
	}
	
	public String toString(){
		return "Stringed2";
	}
	
	public void adjust(){
		System.out.println(this + ".adjust()");
	}
}

class Bass2 extends Winds2{
	public String toString(){
		return "Bass";
	}
}
class Woodwind2 extends Winds2{
	public String toString(){
		return "Woodwind";
	}
}


public class Music5 {
	static void tune(Playable p){
		p.play(Note.MIDDLE_C);
	}
	static void tuneAll(Playable[] e){
		for(Playable i :e){
			tune(i);
		}
	}
	public static void main(String[] args) {
		Playable[] orchestra = {
				new Winds2(),
				new Percussion2(),
				new Stringed2(),
				new Bass2(),
				new Woodwind2()
		};
		tuneAll(orchestra);
	}

}
