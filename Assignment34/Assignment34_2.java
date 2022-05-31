/*2. Write java program which accept N numbers from user and accept one another number as NO , return index of first occurrence of that NO. 
Input :  N :   6 
  NO:  66 
  Elements : 85 66 3 66 93 88  
Output : 1 
Input :  N :   6
NO:  12 
  Elements : 85 11 3 15 11 111  
Output : -1   Program Layout :  */

import java.util.*;

class Number
{
	public int FirstOcc(int Arr[], int iNo)
	{
		int i = 0;
		for(i = 0; i<Arr.length;i++)
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

class Assignment34_2
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
		
		System.out.println("Enter number to search its first occurance :");
		int iValue = sobj.nextInt();

		Number nobj = new Number();
		int iRet = nobj.FirstOcc(Arr, iValue);

		System.out.println("First ocurence of given number is :"+iRet);
	}
}
 