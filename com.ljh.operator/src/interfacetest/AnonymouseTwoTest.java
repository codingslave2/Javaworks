package interfacetest;

public class AnonymouseTwoTest {
	public static void main(String[] args) {
		RemoCon remoCon = new RemoCon() {

			@Override
			public void setOn() {
				System.out.println("Exe---SetOn");
			}
				// TODO Auto-generated method stub
			

			@Override
			public void setOff() {
				System.out.println("Exe---SetOn");
			}
				// TODO Auto-generated method stub
				
			};
			remoCon.setOn();
			remoCon.setOff();
	}

}
