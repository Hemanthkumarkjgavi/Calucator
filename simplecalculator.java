
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class De
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the numbers");
		int first=sc.nextInt();
		int second=sc.nextInt();
		System.out.print("enter the operator(+,-,*,/, %,√, ^):");
		char operator=sc.next().charAt(0);
		double result=0;
		switch (operator){
			case '+':result=first+second;
			break;
			case '-':result=first-second;
			break;
			case '*':result=first*second;
			break;
			case '/':result=first/second;
			break;
			case '%':result=first%second;
			break;
			case '√':result=Math.sqrt(first);
			break;
			case '^':result:Math.Pow(first,second);
			break;
			default:System.out.println("error... operator is not correct");
			}
			System.out.println(first+" "+operator+" "+second+"="+result);
			
			
			
			
			
	}
	
}
