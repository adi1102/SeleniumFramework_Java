package Calc;

public class Calculator {

	
	public int getSum(int a, int b)
	{
		return a+b;
	}
	public int getSub(int a, int b)
	{	
		if (a>b)
		return a-b;
		else return b-a;
	}
	public int getMul(int a, int b)
	{
		return a*b;
	}
	public int getDiv(int a, int b)
	{	
		if (a>b)
		return a/b;
		
		else return b/a;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator ();
		System.out.println(calc.getSum(10, 20));
		System.out.println(calc.getSub(10, 20));
		System.out.println(calc.getMul(25, 42));
		System.out.print(calc.getDiv(10, 45));

	}

}
