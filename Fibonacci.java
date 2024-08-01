class Fibonacci
{
	public static void main(String[]args)
	{
		int a=0,b=1;
		int n=10;
		int c;
		System.out.println(a);
		System.out.println(b);
		for (int i=0;i<=n;i++)
		{

			c=a+b;
			a=b;
			b=c;
			System.out.println(c);	
		}
	}
}