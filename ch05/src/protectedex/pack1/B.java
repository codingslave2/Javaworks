package protectedex.pack1;

public class B {

	public void method() {
		// protected 접근제한자 사용됨
		A a = new A();
		a.filed = "ok";
		a.method();
	}
	
	
	
}
