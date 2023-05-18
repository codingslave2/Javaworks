package lymin.protectedpackA;

public class ProtectedB {
	public String name;

	public void protectedMethod() {
		ProtectedA protectedA = new ProtectedA();
		protectedA.name = "Pro";
		protectedA.protectedMethod();
	}
}
