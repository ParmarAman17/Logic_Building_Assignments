/*2.Write a program which 2 strings from user and check whether contents of two strings are equal or not.

Input : "Marvellous Infosystems"
      : "Marvellous Infosystems"
Output : TRUE
*/

import java.util.*;

class StringDemo
{
	public boolean StrCmpX(String src, String dest)
	{
		if(src.length() != dest.length())
		{
			return false;
		}
		int  i = 0;
		for( i =0; i<src.length();i++)
		{
			if(src.charAt(i) != dest.charAt(i))
			{
				break;
			}
		}
		if(i == src.length())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

class Assignment35_2
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter first String :");
		String src = sobj.nextLine();
		
		System.out.println("Enter second String :");
		String dest = sobj.nextLine();
	
		StringDemo obj = new StringDemo();
        boolean bRet = obj.StrCmpX(src, dest);
		if (bRet == true)
		{
			System.out.println("Stirng is similar");
		}
		else
		{
			System.out.println("String is not similar");	
		}
	}
}



