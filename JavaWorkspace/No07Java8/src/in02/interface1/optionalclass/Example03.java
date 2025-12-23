package in02.interface1.optionalclass;

import java.util.Optional;

public class Example03 {
	
	Optional<String> getUserNameById(Integer id)
	{
		
		String name=null;
		
		if(id == 1001)
		{
			 name="raju";
		}
		else if(id==1002)
		{
			 name="vinay";
		}
		else if(id==1003)
		{
			 name="chinna";
		}
		
		return	 Optional.ofNullable(name);
		
	}
	
	public static void main(String[] args) {
		
		Example03 e=new Example03();
		
	    Optional<String> userNameById = e.getUserNameById(1004);
		
	    if(userNameById.isPresent())
	    {
	    	String string = userNameById.get();
	    	String upperCase = string.toUpperCase();
	    	System.out.println(upperCase);
	    }
		
		
	}

}
