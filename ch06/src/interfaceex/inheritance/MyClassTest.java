package interfaceex.inheritance;

public interface MyClassTest {

	public static void main(String[] args) {
		// 구현 클래스인 MyClass의 객체 생성
		MyClass myClass = new MyClass();
		
		// 부모형으로 객체 할당
		X x = myClass;
		x.X();
		
		Y y = myClass;
		y.Y();
		
		// MyInterface형으로 객체 생성
		MyInterface iClass = myClass;
		iClass.X();
		iClass.Y();
		iClass.myMethod();
	}

}
