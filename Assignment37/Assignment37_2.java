/*2.Write Java program which accept number of rows and number of columns from user and display below pattern.

Input : iRow = 4 iCol = 3
Output : 

1 2 3
1 2 3
1 2 3
1 2 3
*/

import java.util.*;

class Pattern
{
	public void Pattern(int iRow, int iCol)
	{
		int i = 0, j = 0;
		
		for(i = 1;i<=iRow;i++)
		{
			for(j = 1;j<=iCol;j++)
			{
				System.out.print(j+"\t");
			}
			System.out.print("\n");
		}
	}	
}

class Assignment37_2
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter  rows number :");
		int iValue1 = sobj.nextInt();
		
		System.out.println("Enter  columns number :");
		int iValue2 = sobj.nextInt();
		
		Pattern obj = new Pattern();
		
		obj.Pattern(iValue1, iValue2);
	}
}
