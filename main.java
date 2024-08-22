package programs;
import java.util.*;
public class main {
	void display() {
		this.show();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Age:");
		int a=in.nextInt();
		System.out.println("Name:"+a);
	}
	void show() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name:");
		String s=in.nextLine();
		System.out.println("Name:"+s);
	}
	public static void main(String[] args) {
		main s = new main();
		s.display();
	}

}
