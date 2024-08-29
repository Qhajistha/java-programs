package programs;
import java.util.*;
public class Dog {
	String name;
	String color;
	public Dog(String n, String c) {
		name=n;
		color=c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Name of Dog:");
		String n=in.nextLine();
		System.out.println("Enter the Colour of Dog:");
		String c=in.nextLine();
		Dog myObj=new Dog(n,c);
		System.out.println("name:"+myObj.name+"\n"+"Colour:"+myObj.color);
	}

}
