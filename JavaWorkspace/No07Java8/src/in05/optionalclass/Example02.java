package in05.optionalclass;

import java.util.Optional;

public class Example02 {

	Optional<String> getUserNameById(int id) {
		String userName = null;
		if (id == 100) {
			userName = "raju";
		} else if (id == 101) {
			userName = "rani";
		} else if (id == 102) {
			userName = "jhon";
		}
		return Optional.ofNullable(userName);
	}

	public static void main(String[] args) {

		Example02 e1 = new Example02();
		Optional<String> userNameById = e1.getUserNameById(102);
		if(userNameById.isPresent())
		{
			System.out.println(userNameById.get());
		}
		

	}

}
