package in.versionit.array2;

public class Example4 {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 10, 20 };
		
		for (int i = 0; i < a.length; i++) {
			
			boolean isUnique=true;
			
			for (int j = 0; j < a.length; j++) {
				
				if(i != j  && a[i] == a[j])
				{
					isUnique=false;
				}
				
			}
			
			if(isUnique==true)
			{
				System.out.println(a[i]);
			}
			
		}

	}

}
