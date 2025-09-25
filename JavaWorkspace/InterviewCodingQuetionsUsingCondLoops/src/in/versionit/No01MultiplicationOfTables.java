package in.versionit;

import java.util.Scanner;

public class No01MultiplicationOfTables {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the table number : ");
		
		int n = sc.nextInt();      //Control+1+enter  5
		
//		5x1=05 ,5x2=10
		for (int i = 1; i <= 100; i++) {        
			
			System.out.println(n+"X"+i+"="+(n*i)); 
			
		}
		
		
		
		
		
	}

}
