// Write a Java Program to create a Calculator using Switch case (Use Scanner Class)
import java.util.*;
public class calculator{
    public void sum(float a, float b){
        System.out.println(a+b);
    }
    public void substract(float a, float b){
        System.out.println(a-b);
    }
    public void multiply(float a, float b){
        System.out.println(a*b);
    }
    public void division(float a, float b){
        System.out.println(a/b);
    }
    public void modulo(float a, float b){
        System.out.println(a%b);
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a, b values");
        float a=s.nextFloat();
        float b=s.nextFloat();
        System.out.println("1.sum\n2.substract\n3.multiply\n4.division\n5.modulo\n");
        System.out.println("enter your choice:");
        int choice=s.nextInt();
        calculator e=new calculator();
        switch(choice){
            case 1:e.sum(a,b);
                break;
            case 2:e.substract(a,b);
                break;
            case 3:e.multiply(a,b);
                break;
            case 4:e.division(a,b);
                break;
            case 5:e.modulo(a,b);
                break;
            default:System.out.println("Invalid choice!!");
        }
    }
}
