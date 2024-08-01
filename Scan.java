class Fibonacci
{
	public static void main(String[]args)
	{
		int a=0,b=1;
		int n=10;
		int c;
		for (i=0;i<=n;i++)
		{
			System.out.println(a);
			System.out.println(b);
			c=a+b;
			a=b;
			b=c;
		}
	}
}