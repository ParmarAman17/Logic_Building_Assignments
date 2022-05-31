/*1. Write java program which accept N numbers from user and accept one another number as NO , check whether NO is present or not. 
Input :  N :   6 
  NO:  66 
  Elements : 85 66 3 66 93 88  
Output : TRUE 
Input :  N :   6 
  NO:  12 
  Elements : 85 11 3 15 11 111  
Output : FALSE   Program Layout :  */

import java.util.*;

class Number 
{
    boolean Check(int Brr[], int iNo) 
    {
        int i = 0;
       for(i = 0; i < Brr.length; i++)
       {
           if(Brr[i] == iNo)
           {
               return true;
           }
       }
       return false;
    }
}

class Assignment34_1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iSize = 0, iValue = 0, iCnt = 0;
        boolean bRet = false;

		System.out.println("Enter Number of elements");
		iSize = sobj.nextInt();

        System.out.println("Enter Number to search");
		iValue = sobj.nextInt();

		int Arr[] = new int[iSize];

		System.out.println("Enter numbers");
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}

		Number nobj = new Number();
		bRet = nobj.Check(Arr, iValue);

        if(bRet == true)
        {
            System.out.println("number is present");
        }
        else
        {
            System.out.println("number is not present");
        }
	}
}