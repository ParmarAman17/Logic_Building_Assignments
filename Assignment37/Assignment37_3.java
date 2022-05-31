/*3.Write Java program which accept number of rows and number of columns from user and display below pattern.

Input : iRow = 3 iCol = 5
Output : 
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
*/

import java.util.*;

class Pattern
{
	public void Pattern(int iRow, int iCol)
	{
		int i = 0, j = 0;
		
		for(i = iRow;i>0;i--)
		{
			for(j = iCol;j>0;j--)
			{
				System.out.print(j+"\t");
			}
			System.out.print("\n");
		}
	}	
}

class Assignment37_3
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