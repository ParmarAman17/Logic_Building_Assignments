/*4.Write a program which accept number from user and return multiplication of all digits. 
Input :  2395  Output :  270 
Input :  1018 Output :  8 
Input :  9440 Output :  144 
Input :  922432 Output :  864    */

import java.util.*;

class Digit 
{
    int iMult = 1, iDigit = 0;
    public int Multiply(int iNo) 
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 0)
            {
                iDigit = 1;
            }
            iMult = iMult * iDigit;
            iNo = iNo / 10;
        }
        return iMult;
    }
}

class Assignment33_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, iRet = 0;
        System.out.println("Enter the number\n");
        iValue = sobj.nextInt();

        Digit dobj = new Digit();
        iRet = dobj.Multiply(iValue);
        System.out.println("Count is:"+iRet);
    }
}