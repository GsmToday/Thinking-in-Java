package Innerclass;

public class Ex19 {
	class Inner1{
		class Inner2{
			void f(){}
		}
		Inner2 makeInner2(){
			return new Inner2();
		}
	}
	Inner1 makeInner1(){
		return new Inner1();
	}
	static class Nested1{
		static class Nested2{
			void f1(){
			}
		}
		void f2(){
		}
	}
	public static void main(String[] args) {
		Ex19 e = new Ex19();
		e.makeInner1();
		//普通类依赖外部类生成对象
		Ex19.Inner1 inner = e.makeInner1();
		//嵌套类无需依赖外部类生成对象
		Nested1 nester = new Nested1();
		//Note this
		//nest2对于创建它的Ex19类来说是不可见
		Nested1.Nested2 nester2 = new Nested1.Nested2();
	}

}
