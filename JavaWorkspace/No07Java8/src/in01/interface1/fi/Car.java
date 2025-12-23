package in01.interface1.fi;

public class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("Car is started...");
		
	}

	@Override
	public void engine() {
		System.out.println("Car engine...");
		
	}

}
