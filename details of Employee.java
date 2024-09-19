//Write a Java Program to Print Name, Emp Id, Designation and Company name using get and set method
import java.util.*;
public class employee{
    private String Name;
    private int Emp_Id;
    private String Designation;
    private String Company;
    public String getdetails(){
        return Name+Emp_Id+ Designation+Company;
    }
    public void setdetails(String Name, int Emp_Id, String Designation,String Company)
    {
        this.Name= Name;
        this.Emp_Id= Emp_Id;
        this.Designation= Designation;
        this.Company= Company;
    }

    public static void main(String[]args){
        employee A=new employee();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Name");
        String a=s.nextLine();
        System.out.println("Enter empid");
        int b=s.nextInt();
        System.out.println("Enter Designation");
        String c=s.nextLine();
        System.out.println("Enter Company Name");
        String d=s.nextLine();
        A.setdetails(a,b,c,d);
        System.out.println(A.getdetails());
        s.close();
    
}
}


