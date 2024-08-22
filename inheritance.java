package programs;

public class inheritance {
		int salary=60000;
	
	public static class Engineer extends inheritance{
		int bonus=10000;
	}

		public static void main(String[]args) {
			Engineer E=new Engineer();
			System.out.println("Salary:"+E.salary+"\n Bonus:"+E.bonus);
		
	
	}
}