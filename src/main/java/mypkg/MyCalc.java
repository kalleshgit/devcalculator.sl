package mypkg;

public class MyCalc {
	
	int y = 10;
	public void Scan()
	{System.out.println("Hi");}
	public int sum (int a, int b)
	{
		return a+b;
	}
	public int diff (int a, int b)
	{
		return a-b;
	}
	public int mul (int a, int b)
	{
		return a*b;
	}
	public int div (int a, int b)
	{
		return a/b;
	}
	
	public int mul1 (int a, int b)
	{
		return a*b;
	}

	public static void main(String[] args) {
		MyCalc calc= new MyCalc();
		System.out.println("Sum is : "+calc.sum(20, 10));
		System.out.println("Diff is : "+calc.diff(20, 10));
		System.out.println("Multply is : "+calc.mul(20, 10));
		System.out.println("division is : "+calc.div(20, 10));
		System.out.println("mul1 is : "+calc.mul1(20, 10));

	}

}

