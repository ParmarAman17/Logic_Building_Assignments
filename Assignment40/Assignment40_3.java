/*3.Write a java program which accept number of rows and number of columns from user and display below pattern.

Input : iRow = 6 iCol = 6
Output : 
* * * * * *
*       * *
*     *   *
*   *     *
* *       *
* * * * * *
*/

import java.util.*;

class Pattern
{
	public void Pattern(int iRow, int iCol)
	{
		int i = 0, j = 0;
		
		for( i = iRow;i>=1; i--)
		{
			for(j = 1; j<=iCol; j++)
			{
				if(	(i ==1) || (i == iRow) || (j == 1) || (j == iCol)	)
				{
					System.out.print("*"+"\t");
				}
				else if(i==j)
				{
					System.out.print("*"+"\t");
				}
				else
				{
					System.out.print(" "+"\t");			
				}
			}
			System.out.println();
		}
	}	
}

class Assignment40_3
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


