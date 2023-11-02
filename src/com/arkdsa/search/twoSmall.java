class twoSmall 
{
	public static void main(String[] args) 
	{
		int m=4,n=10 , l=24;
		int res=(m<n)? m: n;
		System.out.println(res);
		System.out.println("-----------------------");
		int res1 =(m> n && m> l)? m: (n>l)?n:l;
		System.out.println("largest among three numbers:"+res1);

	
	}
}
