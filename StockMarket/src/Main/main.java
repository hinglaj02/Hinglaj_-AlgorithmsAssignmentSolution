package Main;
import operations.*;
import java.util.Scanner;

import sortimplimentation.MergeSortImplementation;
import sortimplimentation.MergeSortImplementation1;


public class main extends Company_rose1 {

	private static int count1;

	public static void main(String[] args) {
		// TODO Auto-generated method
		sortimplimentation.MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		sortimplimentation.MergeSortImplementation1 mergeSortImplementation1 = new MergeSortImplementation1();
		
		operations.company_rose ob = new company_rose();
		operations.exit ob1 = new exit();
		operations.Company_rose1 ob2 = new Company_rose1();
		operations.class3 ob3 = new class3();
		
	
		System.out.println("Enter the no. of companies ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int j =0 ;
		double[] price = new double[N];
		if(j<=20)
		
		for (int i = 0; i < N ; i++)
		{
			System.out.println("Enter the current stock price of company no." + (i+1));
			
			price[i] = sc.nextDouble();
			
			ob2.booleaninput();
		}
			
		
			
		
		for(j = 0;  j<=20; j++)
		{
			ob.enter_data1();
		int data = sc.nextInt();
		
		
		
		switch (data)
		{
		
		
		case 1:System.out.println("Stock prices in ascending order are :");
		mergeSortImplementation1.sort(price,0,price.length-1);
		mergeSortImplementation1.display(price);
		break;
		case 2:System.out.println("Stock prices in dscending order are :");
		mergeSortImplementation.sort(price,0,price.length-1);
		mergeSortImplementation.display(price);
		break;
		
		case 3: int l = ob.comp_rose();
				System.out.println("the total no. of companies for which stock prices rose today : " + l);
			break;
		case 4: int m = ob.comp_notrose();
				System.out.println("the total no. of companies for which stock prices declined today  : " + m);
		break;
		case 5 :System.out.println("Enter the stock you want to search");
			mergeSortImplementation1.sort(price,0,price.length-1);	
			
		double key = sc.nextDouble();
		int last = price.length-1;
		int first = 0;
				mergeSortImplementation1.binarys(price, key, last, first);
			break;	
		case 0 : j = ob1.exitcode();
			
		break;	
		default:
		{
			System.out.println("Please Enter value between 0 to 6");
			System.out.print("---------------------------------------------------------------------------------");
			
		}
		
		}
		
		
		}
	}
		
	}


