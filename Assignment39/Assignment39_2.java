/*2.Write Java program which accept String from user and display below pattern.

Input : Hello
Output : 
H e l l o
H e l l *
H e l * *
H e * * *
H * * * *
*/

import java.util.*;

class Pattern
{
	public void Pattern(String str)
	{
		char src[] = str.toCharArray();
		int i = 0, j = 0;
		
		for( i=(str.length()-1);i>=0; i--)
		{
			for(j = 0; j<=(str.length()-1);j++)
			{
				if(i<j)
				{
					System.out.print("*"+"\t");
				}
				else
				{
					System.out.print(src[j]+"\t");
				}
			}
			System.out.println();
		}
	}	
}

class Assignment39_2
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter  String :");
		String stg = sobj.nextLine();
		
		Pattern obj = new Pattern();
		
		obj.Pattern(stg);
	}
}
