package in01.interface1.fi;

public class Bike implements Vehicle{

	@Override
	public void start() {
		System.out.println("Bike is started...");
		
	}

	@Override
	public void engine() {
		System.out.println("Bike engine...");
		
	}
	
	@Override
	public void stop() {
		
		System.out.println("Bike : stop");
	}
	
	
	

}
