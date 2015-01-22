//��̬�������ģʽ 
//Ϊÿһ��Robot���ʹ���NullRobot
package typeinfo;

import java.lang.reflect.*;
import java.lang.reflect.Method;
import java.util.*;

public class NullRobotProxyHandler implements InvocationHandler{
	//ί������Ϣ
	private String nullName;
	//
	private Robot proxied = new NRobot();
	//ί������Ϣͨ�����캯����ֵ
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
	//����
	public Object invoke(Object proxy, Method method, Object[] args)
	throws Throwable{
		return method.invoke(proxied, args);
	}
}
