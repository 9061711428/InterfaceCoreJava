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
		InterfaceArithmeticOperations obj=new InterfaceArithmeticOperations();
		obj.add(a,b);
		obj.sub(a,b);
		obj.mult(a,b);
		obj.div(a,b);
		
		
	}

}
