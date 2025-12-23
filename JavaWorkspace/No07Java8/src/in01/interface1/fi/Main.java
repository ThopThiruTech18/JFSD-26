package in01.interface1.fi;

public class Main {
	
	public static void main(String[] args) {
		
		Vehicle v1=new Bike();
		v1.engine();
		v1.start();
		v1.stop();
		
		Vehicle.wheels();
		
	}

}
