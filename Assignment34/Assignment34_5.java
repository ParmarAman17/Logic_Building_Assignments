/*5.Write java program which accept N numbers from user and return product of all odd elements.

Input : N : 6
Elements :15 66 3 70 10 88
Output : 45

Input : N : 6
Elements :44 66 72 70 10 88
Output : 0
*/

import java.util.*;

class Number
{
	public int OddProduct(int Brr[])
	{
		int i = 0, iMult = 0;
		for(i = 0; i<Brr.length;i++)
		{
			if(	(Brr[i]%2) !=0)
			{
				if(iMult == 0)
				{
					iMult = 1;
				}
				iMult = iMult*(Brr[i]);
			}
		}
		return iMult;
	}
}

class Assignment34_5
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the number of elements :");
		int iSize = sobj.nextInt();
		int Arr[] = new int[iSize];
		
		System.out.println("Enter the elements :");
		for(int i = 0; i<Arr.length; i++)
		{
			Arr[i] = sobj.nextInt();
		}
	
		Number nobj = new Number();
        int iRet = nobj.OddProduct(Arr);
		System.out.println("Product of all Odd elements is :"+iRet);
	}
}


