package Core_Java.Abstraction.Interface;

public class AXISImpl implements IRBI {

	@Override
	public void gateRateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("Axis provides 9% interests rate");
		
	}
	public static void main(String[] args) {
		SBIImpl s = new SBIImpl();
		s.gateRateOfInterest();
		
		AXISImpl a = new AXISImpl();
		a.gateRateOfInterest();
		
	}
	
	}


