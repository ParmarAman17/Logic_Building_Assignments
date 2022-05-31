/*4.Accept sting from user and reverse the contents of that string by toggling the case.
/*
Input : "aCBdef"
Output : "FEDcbA"
*/
import java.util.*;

class StringDemo
{
	public String StrRevTogX(String src)
	{
		char Arr[] = src.toCharArray();
		int i = 0, j = 0;
		for(i = 0,j=(Arr.length-1); i<j;i++,j--)
		{
			char temp = Arr[i];
			if((Arr[j]>='A')&&(Arr[j]<='Z'))
			{
				Arr[i] = (char)(Arr[j] + 32);
			}
			else if((Arr[j]>='a')&&(Arr[j]<='z'))
			{
				Arr[i] = (char)(Arr[j] - 32);
			}
			else
			{
				Arr[i] = Arr[j];
			}
			
			if( (temp>='A') && (temp<='A') ) 
			{
				Arr[j] = (char)(temp + 32);
			}
			else if( (temp>='a') && (temp<='z') )
			{
				Arr[j] = (char)(temp - 32);
			}
			else
			{
				Arr[j] = temp;
			}
		}
		return (new String(Arr));
	}
	
}

class Assignment35_4
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter  String :");
		String src = sobj.nextLine();
		
		StringDemo obj = new StringDemo();
		String sRet = obj.StrRevTogX(src);
		System.out.println("Reverse string is :"+sRet);
	}
}

