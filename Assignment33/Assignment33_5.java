/*5.Write a program which accept number from user and return difference between summation of even digits and summation of odd digits. 
Input :  2395  Output :  -15 (2 - 17) 
Input :  1018 Output :  6 (8 - 2) 
Input :  8440 Output :  16  (16 - 0) 
Input :  5733 Output :  -18 (0 - 18) */

import java.util.*;

class Digit 
{
    int iDigit = 0, iSumEv = 0, iSumOd = 0;
    public int CountDiff(int iNo) 
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) == 0)
            {
                iSumEv = iSumEv + iDigit;
            }
            else
            {
                iSumOd = iSumOd + iDigit;
            }
            iNo = iNo / 10;
        }  
        return iSumEv - iSumOd;  
    }
}

class Assignment33_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, iRet = 0;
        System.out.println("Enter the number\n");
        iValue = sobj.nextInt();

        Digit dobj = new Digit();
        iRet = dobj.CountDiff(iValue);
        System.out.println("Count is:"+iRet);
    }
}
