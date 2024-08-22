package programs;
import java.util.*;
public class simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter amount:");
		float p=in.nextFloat();
		System.out.println("Enter time period:");
		float t =in.nextFloat();
		System.out.println("Enter rate of interest:");
		float r =in.nextFloat();
		float s=(p*t*r)/100;
		System.out.println("Simple interest of given "+p+" is: "+s);
		
	}

}
