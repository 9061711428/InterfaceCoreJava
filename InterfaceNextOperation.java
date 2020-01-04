package interfaceNew;

public class InterfaceNextOperation implements InterfaceExample1,InterfaceExp2{
	
public void add(int a,int b)//add 2 values
{
	System.out.println((a+b));
	
}
public void sub(int a,int b)
{
	System.out.println((a-b));//sbtract 2 values
	
}
public void mult(int a,int b)
{
	System.out.println((a*b));
	
}
public void div(int a,int b)
{
	System.out.println((a/b));
	
}

}
