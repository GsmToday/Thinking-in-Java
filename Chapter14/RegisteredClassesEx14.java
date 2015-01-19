package typeinfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
class Part1{
	public String toString(){
		return getClass().getSimpleName();
	}
	static List<Class<? extends Part1>> partFactories = new ArrayList<Class <? extends Part1>>();
	static {
		partFactories.add(FuelFilter1.class);
		partFactories.add(AirFilter1.class);
		partFactories.add(CabinAirFilter1.class);
		partFactories.add(OilFilter1.class);
		partFactories.add(FanBelt1.class);
		partFactories.add(GeneratorBelt1.class);
		partFactories.add(PowerSteeringBelt1.class);
	}
	private static Random rand = new Random(47);
	public static Part1 createRandom(){
		int n = rand.nextInt(partFactories.size());
		try {
			return partFactories.get(n).newInstance();
		} catch(InstantiationException e) {
			throw new RuntimeException(e);
		} catch(IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
}

class Filter1 extends Part1{}
class FuelFilter1 extends Filter1{
	public static class Factory 
	implements typeinfo.Factory<FuelFilter>{
		public FuelFilter create(){
			return new FuelFilter();
		}
	}
}

class AirFilter1 extends Filter1{
	public static class Factory 
	implements typeinfo.Factory<AirFilter1>{
		public AirFilter1 create(){
			return new AirFilter1();
		}
	}
}

class CabinAirFilter1 extends Filter1{
	public static class Factory 
	implements typeinfo.Factory<CabinAirFilter1>{
		public CabinAirFilter1 create(){
			return new CabinAirFilter1();
		}
	}
}

class OilFilter1 extends Filter1{
	public static class Factory 
	implements typeinfo.Factory<OilFilter1>{
		public OilFilter1 create(){
			return new OilFilter1();
		}
	}
}

class Belt1 extends Part1{}

class FanBelt1 extends Belt1{
	public static class Factory
	implements typeinfo.Factory<FanBelt1>{
		public FanBelt1 create(){
			return new FanBelt1();
		}
	}
}
class GeneratorBelt1 extends Belt1{
	public static class Factory
	implements typeinfo.Factory<GeneratorBelt1>{
		public GeneratorBelt1 create(){
			return new GeneratorBelt1();
		}
	}
}
class PowerSteeringBelt1 extends Belt1{
	public static class Factory
	implements typeinfo.Factory<PowerSteeringBelt1>{
		public PowerSteeringBelt1 create(){
			return new PowerSteeringBelt1();
		}
	}
}
public class RegisteredClassesEx14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i<10;i++){
			Prt.prt(""+Part.createRandom());
		}        
	}

}
