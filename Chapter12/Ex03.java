//数组越界arrayindexoutofbounds
//日志记录
package Exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Ex03 {
	private static Logger logger = Logger.getLogger("LoggingException1");
	static void logException(Exception e){
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array = new char[10];
		try{
			for(int i = 0; i<20;i++){
				array[i] = 'a';
			}
		}catch(Exception e){
			logException(e);
		}
	}

}
