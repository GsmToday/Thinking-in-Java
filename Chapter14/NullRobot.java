package typeinfo;

import java.lang.reflect.Proxy;

public class NullRobot {
	//���ۺ�ʱ���������Ҫһ����Robot����
	//����newNullRobot() ��������Ҫ�����Robot����
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
