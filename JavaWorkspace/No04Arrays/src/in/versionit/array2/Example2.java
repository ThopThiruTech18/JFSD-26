package in.versionit.array2;

public class Example2 {
	
	public static void main(String[] args) {
		
		int a[]={10,20,30,40,50,60};
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			
//			sum=sum+a[i];  
			sum+=a[i];//  10--> 30+30=60+40=100
			
			
		}
		System.out.println("Sum of the array is : "+sum); 
		System.out.println("Average of the array is : "+(sum/a.length));//sum of the var/no of var
		
	}

}
