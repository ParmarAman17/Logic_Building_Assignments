/*1.Write a java program which accepts 2 strings from user and concat N characters of second string after first string.
    Value of N should be accepted from user.
    Note : If third parameter is greater than the size of second string then concat whole string after first string.

Input : "Marvellous Infosystems"
      : "Logic Building"
      :  5
Output : "Marvellous Infosystems Logic"
*/

import java.util.*;

class StringDemo
{
	public String StrNCatX(String src, String dest, int iCnt)
	{
		if(iCnt <0)
		{
			iCnt = -iCnt;
		}
		if(iCnt>dest.length())
		{
			iCnt = dest.length();
		}
		int i = 0, j = 0;
		
		char result[] = new char[src.length()+iCnt];
		char source[] = src.toCharArray(); 
		char destination[] = dest.toCharArray();
		
		for (i = 0; i<src.length();i++)
		{
			result[i] = source[i];
		}
		for( i =src.length(), j=0; j<iCnt; i++, j++)
		{
			result[i] = destination[j];
		}
		return (new String(result));
	}
	
}

class Assignment35_1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter first String :");
		String str1 = sobj.nextLine();
		
		System.out.println("Enter second String :");
		String str2 = sobj.nextLine();
		
		System.out.println("Enter how much characters of second string after first string :");
		int iSize = sobj.nextInt();
	
		StringDemo obj = new StringDemo();
        String sRet = obj.StrNCatX(str1, str2, iSize);
		System.out.println("New string :"+sRet);
	
	}
}


