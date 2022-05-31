/*1.Write Java program which accept String from user and display below pattern.

Input : Hello
Output : 
H e l l o
H e l l o
H e l l o
H e l l o
*/

import java.util.*;

class Pattern
{
	public void Pattern(String str)
	{
		char src[] = str.toCharArray();
		int i = 0, j = 0;
		for( i = 0;i<str.length();i++)
		{
			for(j = 0; j<str.length();j++)
			{
				System.out.print(src[j]+"\t");
			}
			System.out.print("\n");
		}
	}	
}

class Assignment38_1
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

