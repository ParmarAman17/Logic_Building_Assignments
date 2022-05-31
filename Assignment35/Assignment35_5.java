/*5.Accept string from user and check whether the string is palindrome or not without considering its case.

Input : "1abccBA1"
Output : TRUE
*/

import java.util.*;

class StringDemo
{
	public boolean strPallindrome(String src)
	{
		int i =0, j = src.length()-1;
		while(i<j)
		{
			if((src.charAt(i)!=src.charAt(j))&&((src.charAt(i)+32)!=src.charAt(j))&&((src.charAt(i)-32)!=src.charAt(j)))
			{
				break;
			}
			i++;
			j--;
		}
		if(i<j)
		{
			return false;
		}
		else
		{
			return true;
		}
	}	
}

class Assignment35_5
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter  String :");
		String src = sobj.nextLine();
		
		StringDemo obj = new StringDemo();
		boolean bRet = obj.strPallindrome(src);
		if(bRet == true)
		{
			System.out.println("String is Pallindrome");
		}
		else
		{
			System.out.println("String is not Pallindrome");
		}
	}
}

