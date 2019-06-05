package Reersenumber;

public class Arraysort 
{
	public static void main(String[] args) 
	{
		int a[]={10,2,3,5,46,97,86};
		int temp=0;
		for (int i = 0; i <=a.length; i++) 
		{
			for (int j = 0; j <a.length-i-1; j++)
			{
				if(a[j]>a[j+1])
				{
			  temp=a[j];
			  a[j]=a[j+1];
			  a[j+1]=temp;
			  }
				
			}
			
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
			
		}
		
	}

}
