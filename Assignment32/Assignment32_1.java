/*1. Write Java program which accept N numbers from user and 
return difference between summation of even elements and summation of odd elements. 
Input :  N :   6 
  Elements : 85 66 3 80 93 88  
Output : 53 (234 - 181)   Program Layout :  */

import java.util.*;

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;
        System.out.println("Enter elements");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }
}

class ArrayDemo extends ArrayX
{
    public ArrayDemo(int iValue)
    {
        super(iValue);
    }

    public int Difference()
    {
        int iCnt = 0, iDiff = 0, iSum = 0, iDiv = 0;
        for(iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            if((Arr[iCnt]%2)==0)
            {
                iSum = iSum + Arr[iCnt];
            }
            else
            {
                iDiv = iDiv + Arr[iCnt];
            }
        }
        iDiff = iSum - iDiv;
        return iDiff;
    }
}

class Assignment32_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iLength = 0, iRet = 0;

        System.out.println("Enter the number of element");
        iLength = sobj.nextInt();

        ArrayDemo adobj = new ArrayDemo(iLength);
        adobj.Accept();
        iRet = adobj.Difference();
        System.out.println("Difference is: "+iRet);

    }
}

 