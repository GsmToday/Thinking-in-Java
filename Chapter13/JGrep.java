package String;
import java.util.regex.*;
public class JGrep {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Pattern p = Pattern.compile("i\\w*");
		int index = 0;

		Matcher m = p.matcher("");
		
		for(String line:new TextFile("F:\\test.txt")){
			m.reset(line);
			
			while(m.find()){
				System.out.println(index++ +": "+m.group()+ "  : "+m.start());
			}

		}
	}

}
