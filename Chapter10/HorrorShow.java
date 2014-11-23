/**
 * Inner class
 * Chapter 10 in Thinking in Java
 * Practice 14
 * Anonymous inner class
 */
package Innerclass;

interface Monster{
	void menace();
}

interface DangerousMonster extends Monster{
	void destroy();
}

interface Lethal{
	void kill();
}
/*
class DragonZilla implements DangerousMonster{
	public void menace(){}
	public void destroy(){}
}*/

interface Vampire extends DangerousMonster, Lethal{
	void drinkBlood();
}
/*
class VeryBadVampire implements Vampire{
	public void menace(){};
	public void destroy(){};
	public void kill(){};
	public void drinkBlood(){};
}*/

public class HorrorShow {
	static void u(Monster b){
		b.menace();
	}
	static void v(DangerousMonster b){
		b.menace();
		b.destroy();
	}
	static void w(Lethal l){
		l.kill();
	}
	
	public DangerousMonster generatemonster(){  
		return new DangerousMonster(){
			public void menace(){
				Prt.prt("Monster innerclass menace");
			}
			public void destroy(){
				Prt.prt("Monster innerclass destroy");
			}
		};
	}
	public Vampire gerneratevampire(){
		return new Vampire(){
			public void menace(){Prt.prt("Vampire innerclass menace");};
			public void destroy(){Prt.prt("Vampire innerclass destroy");};
			public void kill(){Prt.prt("Vampire innerclass kill");};
			public void drinkBlood(){Prt.prt("Vampire innerclass drinkBlood");};
		};
	}
	public static void main(String[] args) {
		HorrorShow barney = new HorrorShow();
		DangerousMonster cla = barney.generatemonster();
		Vampire clarensis = barney.gerneratevampire();
		cla.destroy();
		cla.menace();
	}

}
