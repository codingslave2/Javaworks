package interfacetest;

public class Tv implements RemoCon {

	@Override
	public Void setOn() { System.out.println("Tv On");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOff() {System.out.println("Tv off");
		// TODO Auto-generated method stub
		
	}

}
