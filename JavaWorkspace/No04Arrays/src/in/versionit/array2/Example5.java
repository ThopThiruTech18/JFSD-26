package in.versionit.array2;

public class Example5 {

	public static void main(String[] args) {

		int a[] = {  5, 3, 6, 8 }; //3,5,6,8 ascending order  or 8,6,5,3
		
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
				if(a[i] > a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}

	}

}
