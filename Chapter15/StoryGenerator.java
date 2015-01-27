package generics.character;
import java.util.*;
import gsm.Prt;
import generics.Generator;


public class StoryGenerator implements Generator<StoryCharacters>{
	private Class[] types = {GoodGuys.class, BadGuys.class};
	private static Random rand = new Random(47);
	public StoryGenerator(){}
	public StoryCharacters next(){
		try{
			return (StoryCharacters)types[rand.nextInt(types.length)].newInstance();
		}catch(Exception e){
			throw new RuntimeException (e);
		}
	}
	public static void main(String[] args) {
		StoryGenerator gen = new StoryGenerator();
		for(int i=0;i<5;i++){
			Prt.prt(""+gen.next());
		}
	}
}
