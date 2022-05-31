/*3.Write a program which accept 2 strings from user and check whether first N contents of two strings are equal or not.
   Note : If third parameter is greater than the size of second string then concat whole string after first string.

Input : "Marvellous Infosystems"
      :"Marvellous Logic Building"
      :10
Output : TRUE
*/

import java.util.*;

class StringDemo
{
	public boolean StrNCmpX(String src, String dest, int iCnt)
	{
		if(iCnt>dest.length())
		{
			iCnt = dest.length();
		}
		if(iCnt<0)
		{
			iCnt = -iCnt;
		}
		int i = 0;
		for(i = 0; i<iCnt;i++)
		{
			if( (src.charAt(i)) != dest.charAt(i) )
			{
				break;
			}
		}
		if(i == iCnt)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

class Assignment35_3
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter fisrt String :");
		String src = sobj.nextLine();
		
		System.out.println("Enter second String :");
		String dest = sobj.nextLine();

		System.out.println("Enter number of charactor to be compare :");
		int iSize = sobj.nextInt();
	
		StringDemo obj = new StringDemo();
        boolean bRet = obj.StrNCmpX(src, dest, iSize);
		if (bRet == true)
		{
			System.out.println("Stirng are equal");
		}
		else
		{
			System.out.println("String are are equal");	
		}
	}
}