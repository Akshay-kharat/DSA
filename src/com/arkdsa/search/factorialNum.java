import java.util.*;
class  factorialNum
{ 

//****** USING FOR LOOP *********
	public static int fact(int num){
		int sum=1;
		for (int i=1;i<= num ; i++ )
		{ sum= sum*i;
		}
		return sum;
	}



// ******USING RECURSION *****
	 public static int rec(int num){
		if(num==0){
			return 1;
		}else if(num >0){
		return num * rec(num-1);
		}
		return -1;
	} 

	public static void powerNum(int num, int power){// 2`3 =2*2*2
		int sum=1;
		for (int i=1; i<= power ;i++ )
		{ sum=sum*num;
		}
		System.out.print(sum);
	}

	public static void powerRectNum(int num, int power){// 2`3 =2*2*2
		int sum=1;
		for (int i=1; i<= power ;i++ )
		{ 
		}
		System.out.print(sum);
	}


	public static void main(String[] args) 
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number");
		int num=sc.nextInt();
		System.out.println("Enter the power");
		int power=sc.nextInt();
		powerNum(num, power);
		//System.out.println("result of factorial :"+res);
	}
}
