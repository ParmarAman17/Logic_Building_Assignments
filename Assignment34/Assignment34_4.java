/*4.Write java program which accept N numbers from user and accept Range, Display all elements from that range
Input : N : 6
Start: 60
End : 90
Elements :85 66 3 76 93 88
Output : 85 66 76 88

Input : N : 6
Start: 30
End : 50
Elements :85 66 3 76 93 88
Output :
*/

import java.util.*;

class Number
{
	public void Display(int Arr[], int iStart, int iEnd)
	{
		int i = 0;
		for(i = 0; i<Arr.length;i++)
		{
				if(	(Arr[i]>iStart ) &&  (Arr[i]<iEnd )	)
                {
                    System.out.println(+Arr[i]);
                }
					
		}
	
	}
}

class Assignment34_4
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
		
		System.out.println("Enter range start from :");
		int iFirst = sobj.nextInt();
		
		System.out.println("Enter range end to :");
		int iLast = sobj.nextInt();
		
		Number nobj = new Number();
		System.out.println("all elements from given range");
		nobj.Display(Arr, iFirst, iLast);
	}
}


