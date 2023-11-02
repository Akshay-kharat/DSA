import java.util.*;
class priceCar 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the price of the car ");
		double price=sc.nextDouble();
		double totalPrice=0,tax;
		if(price <= 500000){
			tax=(price*0.05);
			totalPrice=tax+price;
		}
		if(price > 500000 && price < 1000000){
			tax=(price*0.1);
			totalPrice=price+tax;
		}if(price > 1000000){
			tax=(price*0.2);
			totalPrice=price+;
		}
      System.out.print("Total price to be paid :"+totalPrice);
	  System.out.print("tax to be paid :"+tax);



	}
}
