package operations;

import java.util.Scanner;

public class Company_rose1 {
	
	public static int count1; public static int count2; public int count;
	public int booleaninput()
	
	{	
		Scanner sc = new Scanner(System.in);
	System.out.println("Whether company's stock price rose today compare to yesterday?");
	System.out.println("Enter True or False");
	String str = sc.next(); 
	
	
	 
	if(str.equalsIgnoreCase("true"))
	 {
		// System.out.println("Total no of companies whose stock price rose today : " + N);
		 
			count1 =  count1 + 1;
		return count1;
      }
	
	 
	 else if(str.equalsIgnoreCase("false")) {
		// System.out.println("Total no of companies whose stock price rose today : " + N);
		 count = 0;
	count2 = count2 + 1;
	return count2;
	 
	 }else
	      {
	         System.out.println("Given string is not a boolean type, Please enter again");
				booleaninput();
	         
	      }
	return count;
	
	
	
	

}
}
	

