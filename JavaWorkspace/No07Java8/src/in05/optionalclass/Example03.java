package in05.optionalclass;

public class Example03 {
	
	String getUserNameById(int id)
	{
		if(id==100)
		{
			return "raju";
		}
		else if(id == 101)
		{
			return "rani";
		}
		else if(id == 102)
		{
			return "jhon";
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		Example03 e1=new Example03();
		String userNameById = e1.getUserNameById(103);
		System.out.println(userNameById.length());
		
		
	}

}
