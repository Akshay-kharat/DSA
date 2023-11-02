package com.arkdsa.alternate;

import java.util.FormatFlagsConversionMismatchException;
import java.util.Scanner;

public class Calculator {
	
    public static void main(String[] args) {
		System.out.println("Welcome to the Calculator");
		Scanner scanner=new Scanner(System.in);
		
		boolean flag=true;
		Calculator calculator=new Calculator();
		while (flag) {
			System.out.println("What u want to do\n1)Addition \n2)Subtraction \n3)Multiplication  \n4)division \n5)to stop");
			int oper=scanner.nextInt();
			int num1=0,num2=0,res=0;
			if (oper != 5) {
				System.out.println("Enter the first value");
				num1=scanner.nextInt();
				System.out.println("Enter the second value");
				num2=scanner.nextInt();
			}
			
			switch (oper) {
			case 1:
				res=num1+num2;
				break;
			case 2:
				res=num1-num2;
				break;
			case 3:
			res=num1*num2;
				break;
			case 4:
			res=num1/num2;
				break;
			case 5:
			flag=false;
			System.out.println("U stop the loop 🙌");
				break;

			default:
				System.out.println("you entered wrong inp value try again ^_^");
				break;
				
			}
			
			try {if(flag == true) {
				System.out.println("result is::"+res);
				Thread.sleep(2000);}
				
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}

}
