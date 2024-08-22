package programs;

public class overridingAnimal {
	public void display() {
		System.out.println("Its a dog");
	}
	public static class dog extends overridingAnimal{
		public void display() 
		{
			System.out.println("Its a Golden dog");
		}
		public static void main(String[]args)
			{
				dog d = new dog();
				d.display();
			
		}
	}
	
}
