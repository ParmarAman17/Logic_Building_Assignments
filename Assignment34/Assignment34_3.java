/* 3. Write java program which accept N numbers from user and accept one another number as NO , 
    return index of last occurrence of that NO.
Input : N : 6
NO: 66
Elements :85 66 3 66 93 88
Output : 3

Input : N : 6
NO: 93
Elements :85 66 3 66 93 88
Output : 4

Input : N : 6
NO: 12
Elements :85 11 3 15 11 111
Output : -1
*/

import java.util.*;

class Number
{
	public int LastOcc(int Arr[], int iNo)
	{
		int i = 0;
		for(i = Arr.length-1; i>0;i--)
		{
			if(Arr[i]==iNo)
			{
				break;
			}
		}
		if(i == Arr.length)
		{
			return -1;
		}
		else
		{
			return i;
		}
	}
}

class Assignment34_3
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
		
		System.out.println("Enter number to search its last occurance :");
		int iValue = sobj.nextInt();

		Number nobj = new Number();
		int iRet = nobj.LastOcc(Arr, iValue);

		System.out.println("Last ocurence of given number is :"+iRet);
	}
}


