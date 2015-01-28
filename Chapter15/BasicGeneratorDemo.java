package generics;
import generics.coffee.*;
import generics.character.*;

public class BasicGeneratorDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
		//Generator<Breve> gen = BasicGenerator.create(Breve.class);
		Generator<Breve> gen = new BasicGenerator<Breve>(Breve.class);
		for(int i = 0 ;i < 5;i++){
			Prt.prt(""+gen.next());
		}
	}

}
