class fourNum 
{
	public static void main(String[] args) 
	{
		int m=10,n=12,l=67,a=13;
		int res=(m<n && m<l && m<a) ? m : (n<l && n<a) ? n : (a<l)? a:l;
    System.out.println("smallest among four is :"+ res );
	}
}
