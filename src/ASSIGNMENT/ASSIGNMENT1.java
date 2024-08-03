package ASSIGNMENT;



public class ASSIGNMENT1 {

	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("result is "+c);
		
		return c;
	}
	
	public int sub(int x1, int x2) {
		int x3;
	    x3= x1+  x2;
		System.out.println("result is"+x3);
		return x3;
	}
	public void multiplication(int s, int r)
	{
		int result;
		result= s+r;
		System.out.println("result is"+result);
	}
	
	public void division(int q, int t)
	{
		int divresult;
		divresult= q/t;
		System.out.println("result is"+divresult);
	}
	
	public static void main(String[] args)
	{
		ASSIGNMENT1 obj=new ASSIGNMENT1 ();
		int sumresult= obj.sum(10, 2);
		int subresult= obj.sub(10, 2);
		obj.multiplication(sumresult, subresult);
		int multiplication= obj.sub(10, 2);
		obj.division(multiplication, 2);
		
		
}}
