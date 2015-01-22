//动态代理设计模式 
//为每一个Robot类型创建NullRobot
package typeinfo;

import java.lang.reflect.*;
import java.lang.reflect.Method;
import java.util.*;

public class NullRobotProxyHandler implements InvocationHandler{
	//委托人信息
	private String nullName;
	//
	private Robot proxied = new NRobot();
	//委托人信息通过构造函数赋值
	NullRobotProxyHandler(Class<? extends Robot> type){
		nullName = type.getSimpleName() + "NullRobot";
	}
	private class NRobot implements Null,Robot{
		public String name(){
			return nullName;
			};
		public String model(){
			return nullName;
			};
		public List<Operation> operations(){
			return Collections.emptyList();
			};
	}
	//代理
	public Object invoke(Object proxy, Method method, Object[] args)
	throws Throwable{
		return method.invoke(proxied, args);
	}
}
