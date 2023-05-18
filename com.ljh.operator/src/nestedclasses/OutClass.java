package nestedclasses;

public class OutClass {

	OutClass() {
	System.out.println("OutClasses is Constructctor");
}
	// 인스턴스 멤버 클래스 입니다.
		class NestedClass01 {
			int nId = 0;

			NestedClass01() {
				System.out.println("NestedClass01 Constructor");
			}

			void nestedClass01Method() {
				System.out.println("NestedClass01 id value is " + this.nId);
				System.out.println("nestedClass01Method call...");
			}	}
		}


