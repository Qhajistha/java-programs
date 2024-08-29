package programs;
import java.util.*;
public class Computer {
	public class Processor{
		String Brand;
		float speed;
		public  void displayDetails() {
			Brand="Dell";
			speed=2345;
			System.out.println("Brand"+Brand+"\n"+"Speed"+speed);
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Computer myObj= new Computer();
		Computer.Processor in =myObj.new Processor();
		in.displayDetails();
	}

}
