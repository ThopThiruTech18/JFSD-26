package in01.interface1.fi;

public class Bus implements Vehicle{

	@Override
	public void start() {
		System.out.println("Bus is started...");
		
	}

	@Override
	public void engine() {
		System.out.println("Bus engine...");
		
	}

}
