//多重继承练习-默认适配器模式
/**
 * For interface,
 * Chapter 9 in Thinking in Java
 * Practice 12
 */
package interface9;

interface CanFight{
	void fight();
}

interface CanSwim{
	void swim();
}

interface CanFly{
	void fly();
}

interface CanClimb{
	void climb();
}

class ActionCharacter{
	public void fight(){
	}
}

class Hero extends ActionCharacter
	implements CanFight, CanSwim, CanFly,CanClimb
	{
	public void swim(){}
	public void fly(){}
	public void climb(){}
	}

public class Adventure {
	public static void t(CanFight x){
		x.fight();
	}
	public static void u(CanSwim x){
		x.swim();
	}
	public static void v(CanFly x){
		x.fly();
	}
	public static void w(ActionCharacter x){
		x.fight();
	}
	public static void z(CanClimb x){
		x.climb();
	}

	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
		z(h);
	}

}
