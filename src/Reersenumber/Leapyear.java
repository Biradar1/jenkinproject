package Reersenumber;

public class Leapyear 
{
	public static void main(String[] args)
	{
		int year=2000;
		if(year%400==0||(year%4==0&&year%100!=0))
		{
			System.out.println("This is the leap year");
		}
		
	}

}
