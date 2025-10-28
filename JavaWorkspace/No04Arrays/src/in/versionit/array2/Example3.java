package in.versionit.array2;

public class Example3 {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50, 60, 5, 1 };
		int min = a[0];
		int max = a[0];

		for (int i = 0; i < a.length; i++) {

			if (min > a[i]) {
				min = a[i];
			}
			
			if(max < a[i])
			{
				max=a[i];
			}

		}
		System.out.println(min);
		System.out.println(max);

	}

}
