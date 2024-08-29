package programs;

public class Shape {
	public void getArea() {
		System.out.println("Area ");
	}
	public  class Rectangle extends Shape {
		public void getArea() {
			
			int b=10;
			int h=10;
			System.out.println("Area of rectangle:"+b*h);
		}
	
	
	public static void main(String[] args) {
		Shape c=new Shape();
		Shape.Rectangle in=c.new Rectangle();
		in.getArea();
	
	}
	}
}
