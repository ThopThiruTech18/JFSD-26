package in02.interface1.optionalclass;

public class Example02 {
	
	String getUserNameById(Integer id)
	{
		if(id == 1001)
		{
			return "raju";
		}
		else if(id==1002)
		{
			return "vinay";
		}
		else if(id==1003)
		{
			return "chinna";
		}
		else
		{
			return null;
		}
	}
	
	public static void main(String[] args) {
		
		Example02 e=new Example02();
		
		String userNameById = e.getUserNameById(1004);
		String upperCase = userNameById.toUpperCase();
		System.out.println(upperCase);
		
		
	}

}
