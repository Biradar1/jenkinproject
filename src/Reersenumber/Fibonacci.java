package Reersenumber;

public class Fibonacci {
	static int a=0,b=1;
public static void main(String[] args) 
{
	System.out.println(a+"add"+b);
	fib(10);
	
}
public static void fib(int n)
{
     if(n>=0){
	int c=a+b;
	
	a=b;
	b=c;
	System.out.println(c);
	fib(n-1);
}
	
}
}
