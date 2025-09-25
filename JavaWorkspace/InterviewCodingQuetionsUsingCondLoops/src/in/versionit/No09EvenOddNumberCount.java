package in.versionit;

public class No09EvenOddNumberCount {

	public static void main(String[] args) {

		int num = 12333, rem, even = 0, odd = 0;

		while (num > 0) {
			rem = num % 10; // 12333

			if (rem % 2 == 0) {
				even++;
			} else {
				odd++;

			}
			num = num / 10; //// 1

		}

		System.out.println(even);
		System.out.println(odd);
	}

}
