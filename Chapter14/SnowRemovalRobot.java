//É¨Ñ©»úÆ÷ÈË
package typeinfo;
import java.util.*;

public class SnowRemovalRobot implements Robot{
	private String name;
	public SnowRemovalRobot(String name)  {
		this.name = name;
	}
	
	public String name(){
		return name;
	}
	public String model(){
		return "Snowbow Series 11";
	}
	public List<Operation> operations(){
		return Arrays.asList(
				new Operation(){
					public String description(){
						return name + "can shovel snow";
					}
					public void command(){
						Prt.prt(name +"shoving snow");
					}
				},
				new Operation(){
					public String description(){
						return name + " can chip ice";
					}
					public void command(){
						Prt.prt(name +"chipping ice");
					}
				},
				new Operation(){
					public String description(){
						return name + "can clear the roof";
					}
					public void command(){
						Prt.prt(name +" clearing the roof");
					}
				}
				);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
