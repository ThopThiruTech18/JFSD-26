package in03.interface1.functionalInterfaces.customfi;

public class Example02 {
//	public int add(int a,int b);
	public static void main(String[] args) {
		
		 Calculator cal=(a,b,c)-> a+b+c;
		 
		 int result=cal.add(10, 20, 30);
		 System.out.println(result);
		 
		 
		
	}

}
