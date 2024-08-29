package programs;

public class Cat {
	String name;
	int age;
	
	public  Cat(){
		name="Unknown";
		age=0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat myObj = new Cat();
		System.out.println("Name:"+myObj.name+"\n"+"Age:"+myObj.age);
	}

}
