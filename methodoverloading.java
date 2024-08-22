package programs;

public class methodoverloading {
	public int sum(int x, int y)
	{
		return(x+y);
	}
	public int sum(int x,int y, int z)
	{
		return (x+y+z);
	}
	public double sum(double x, double y)
	{
		return(x+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloading s=new methodoverloading();
		System.out.println(s.sum(5, 10));
		System.out.println(s.sum(2, 3,5));
		System.out.println(s.sum(2.5,7.5));
	}

}
