//创建两个异常类，每个都自动记录它们自己的日志。
package Exception;
import java.util.logging.*;
import java.io.*;

class LoggingException1 extends Exception {
	private  Logger logger = Logger.getLogger("LoggingException1");
	public LoggingException1(){
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
class LoggingException2 extends Exception {
	private  Logger logger = Logger.getLogger("LoggingException2");
	public LoggingException2(){
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
public class Ex06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new LoggingException1();
		}catch(LoggingException1 e){
			System.err.println("Caught " + e);
		}
		try{
			throw new LoggingException2();
		}catch(LoggingException2 e){
			System.err.println("Caught " + e);
		}
	}

}
