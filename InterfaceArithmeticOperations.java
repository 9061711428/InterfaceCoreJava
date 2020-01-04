package interfaceNew;
import java.util.Scanner;
public class InterfaceArithmeticOperations {
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		InterfaceNextOperations obj=new InterfaceNextOperations();//invoke object of class
		obj.add(a,b);
		obj.sub(a,b);
		obj.mult(a,b);
		obj.div(a,b);
		
		
	}

}
