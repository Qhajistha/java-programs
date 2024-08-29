package programs;
public class Animal {
	public void move() {
		System.out.println("eat");
	}
	public class Cheetah extends Animal{
		public void move() {
			System.out.println("e");
		}
		public static void main(String[] args) {
			Animal n=new Animal();
			Animal.Cheetah a=n.new Cheetah();
			a.move();
		}
	}

}
