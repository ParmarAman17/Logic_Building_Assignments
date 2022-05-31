/*3.Write a program which accept number from user and return the count of digits in between 3 and 7. 
Input :  2395  Output :  1 
Input :  1018 Output :  0 
Input :  4521 Output :  2 
Input :  9922 Output :  0 */

import java.util.*;

class Digit 
{
    public int CountRange(int iNo) 
    {
        int iDigit = 0, iCnt = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit < 7) && (iDigit > 3))
            {
                iCnt++;
            }
            iNo = iNo / 10;
        }
        return iCnt;
    }
}

class Assignment33_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, iRet = 0;
        System.out.println("Eneter the number\n");
        iValue = sobj.nextInt();

        Digit dobj = new Digit();
        iRet = dobj.CountRange(iValue);

        System.out.println("Count is:"+iRet);
    }
}