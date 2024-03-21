package javaprogram;

public class ArraySort 
{
	public static void main(String[] args) 
	{
		int a[]= {10,80,89,45,78};
		
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		
	}
}
