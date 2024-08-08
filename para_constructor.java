package javaq;

public class para_constructor {
	int x;
	public  para_constructor(int y) {
		x=y;
	}
	public static void main(String[]args) {
		para_constructor myObj = new para_constructor(10);
		System.out.println(myObj.x);
	}
}
