/*3.Write Java program which accept number of rows and number of columns from user and display below pattern.

Input : iRow = 3 iCol = 5
Output : A A A A A
		 B B B B B
		 C C C C C
*/
import java.util.*;

class Pattern
{
	public void Pattern(int iRow, int iCol)
	{
		int i = 0, j = 0;
		char ch = '\0';
		
		for(i = 1,ch = 'A';i<=iRow;i++, ch++)
		{
			for(j = 1;j<=iCol;j++)
			{
				System.out.print(ch+"\t");
			}
			System.out.print("\n");
		}
	}	
}

class Assignment36_3
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

