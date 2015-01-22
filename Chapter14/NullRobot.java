package typeinfo;

import java.lang.reflect.Proxy;

public class NullRobot {
	//无论何时，如果你需要一个空Robot对象。
	//调用newNullRobot() 并传递需要代理的Robot类型
	public static Robot newNullRobot(Class<? extends Robot> type){
		return (Robot)Proxy.newProxyInstance(
				NullRobot.class.getClassLoader(), 
				new Class[]{Null.class,Robot.class}, 
				new NullRobotProxyHandler(type)
				);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
