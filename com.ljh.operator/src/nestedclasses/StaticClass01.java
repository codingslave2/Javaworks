package nestedclasses;

public class StaticClass01 {
	int sId = 1;
	static int nameId = 100;

	StaticClass01() {
		System.out.println("StaticClass01 Constructor");
	}

	void staticNestedClassMethod() {
		System.out.println("staticNestedClassMethod sId value is " + sId);
		System.out.println("staticNestedClassMethod call...");
	}

	static void staticNestedClassStaticMethod() {
		System.out.println("staticNestedClassStaticMethod nameId value is " + nameId);
		System.out.println("staticNestedClassStaticMethod call...");
	}


}
