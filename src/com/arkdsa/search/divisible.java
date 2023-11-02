import java.util.Scanner;
class  divisible
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	   System.out.println("Enter the num");
	   int num=sc.nextInt();
	   for(int i=1 ;i<=num ;i++){
	   if(i % 3==0){
		System.out.println("Hi");
	   }
	   if(i % 5==0){
		System.out.println("Bye");
	   } 
	     if(i % 3==0 && i % 5==0){
		System.out.println("HiBye");
	   }
	    else{
			System.out.println(i);
	    }
	   }
	   
		
	}
}
