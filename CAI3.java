import java.util.Scanner;

import java.security.SecureRandom;

public class CAI3
{
 
	private static int corrects;
	private static int wrongs;
	
	public static int number(int nu)
	{
  		SecureRandom roll=new SecureRandom();
 		int num=1+roll.nextInt(nu);
		return num;
 	}
 
	public static int number1(int nu)
	{
  		SecureRandom roll=new SecureRandom();
		int num=2+roll.nextInt(nu);
		return num;
  
 	}
 
 	public static void main(String args[])
	{
  		Scanner input=new Scanner(System.in);
  		String con;
  		int sum;
  		int counter=0;
  		int a=0,b=0;
  
  		SecureRandom rolled=new SecureRandom();
 		int rem=1+rolled.nextInt(4);
  
  		System.out.println("Choose Difficult Level ");
  		int diff=input.nextInt();
  		
		while(counter<10){
   
   		switch(diff)
		{
   			case 1:
    				a=number(3);
    				b=number1(8);
    				break;
   			case 2:
    				a=number(20);
    				b=number1(90);
       				break;
			case 3:
				a = number(100);
				b = number1(999);
				break;
   		}
   
	System.out.print("What is "+a+" times "+b+" = ");
   	sum=input.nextInt();
   	if(sum==a*b)
	{
    		Answer(rem);
   		++corrects;
   	}
	else
	{
   		wrong(rem);
   		++wrongs;
   	}
   
   	++counter;
	}
 

	int percentage = corrects * 10;

  	System.out.println("Total is "+percentage+"%");

 	if(percentage < 75)
	{
		System.out.println("Please see your Teacher for extra Help ");
	}
	else
	{
		System.out.println("Congratulations ");
	}
} 
		

		//Written this one down for evaluation
		public static String wrong(int num)
		{
  			String word="";
  			switch(num)
			{
  				case 1:
   					word="No.Please try Again";
  					break;
  				case 2:
   					word="Wrong.Try once More";
   					break;
  				case 3:
   					word="Dont give Up";
  					break;
  				case 4:
   					word="No keep Trying";
   					break;
			}
  			return word;
		}
 
		//Written for evaluation 
 		public static String Answer(int num)
		{
       
  			String word="";
			switch(num)
			{
				case 1:
   					word="Very good";
					break;
  				case 2:
   					word="Excellent";
   					break;
  				case 3:
   					word="Nice work";
  					break;
  				case 4:
  					word="Keep up the good";
   					break;
  			}
  			return word;
  
 		} 
}