package Reersenumber;

public class Recursion
{
	static int fact=1;
	public static void main(String[] args) 
	{ int no=5;
	Recursion r1=new Recursion();
	r1.functions(no);
	System.out.println(fact);
	r1.add(no);
	System.out.println(sum);
		
	}
	public void functions(int no)
	{
		if(no>=1)
		{
			fact=fact*no;
			functions(no-1);
		}
	}static int sum=0;
	public void add(int no)
	{
		if(no>=0)
		{
			sum=sum+no;
			add(no-1);
		}
	}

}
