/*5.Write Java program which accept number of rows and number of columns from user and display below pattern.

Input : iRow = 3 iCol = 4
Output : 

1  2  3  4
5  6  7  8
9 10 11 12
*/

import java.util.*;

class Pattern
{
	public void Pattern(int iRow, int iCol)
	{
		int i = 0, j = 0, iCnt = 1;
		
		for(i = 0;i<iRow;i++)
		{
			for(j = 0;j<iCol;j++)
			{
				System.out.print(iCnt+"\t");
				iCnt++;
			}
			System.out.print("\n");
		}
	}	
}

class Assignment36_5
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
