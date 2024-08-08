package javaq;
import java.lang.*;
public class math {
	//(Math.sqrt(),toUpperCase(),toLowerCase(),length())
	public static void mymethod(int a) {
		System.out.println(Math.sqrt(a));
	}
	public static void myLower(String a) {
		System.out.println(a.toLowerCase());
	}
	public static void myUpper(String a) {
		System.out.println(a.toUpperCase());
	}
	public static void length(String a) {
		System.out.println(a.length());
	}
	public static void main(String[]args) {
		mymethod(8);
		myLower("QhajiSTha");
		myUpper("Qhajistha");
		length("Qhajistha");
	}

}
