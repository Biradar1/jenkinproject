package Reersenumber;

public class Revers_num
{static int n1=0;
	public static void main(String[] args)
	{
		String  m="mam";
		String s1="";
		for (int i =m.length()-1; i>=0; i--) 
		{
			s1=s1+m.charAt(i);
			System.out.println(s1);
			
		}
		if(m.equals(s1))
		{
			System.out.println("You enter string is armonstraong");
		}
	}
	
	

}
