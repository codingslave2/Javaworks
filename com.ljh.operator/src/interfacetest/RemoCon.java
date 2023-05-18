package interfacetest;

public interface RemoCon {
	public static final int UTD = 100;
	public static final String UID = null;
	
	public int PRODUCT_ID = 1;

	Void setOn();

	abstract void setOff();

default void setInfoMenu() {
	System.out.println("show Info Menu");
}

static void alerError() {
	System.out.println("Error CODE:0001");
}

}
