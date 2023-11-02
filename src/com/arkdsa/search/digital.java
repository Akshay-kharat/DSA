class  digital 
{  

  // ********DIGITAL SUM***********
   public static void digitalSum(int num){
	   int sum=0;
	   while (num > 0)
	   { int rem= num % 10;
	      sum += rem;
		  num /= 10;
	   }
	   System.out.print(sum);
   }
 // ********* digital Sum Of Even******* 
   public static void digitalSumOfEven(int num){
	   int sum=0;
	   while (num > 0)
	   { int rem= num % 10;
	      if (rem % 2 ==0)
	      { sum += rem;
	      }
		  num /= 10;
	   }
	   System.out.print(sum);
   }
  // ******DIGITAL PRODUCT***********
   public static void digitalProd(int num){
	   int prod=1;
	   while (num > 0)
	   { int rem= num % 10;
	      prod *= rem;
		  num /= 10;
	   }
	   System.out.print(prod);
   }

	public static void main(String[] args) 
	{
		digitalSumOfEven(1234);
	}
}
