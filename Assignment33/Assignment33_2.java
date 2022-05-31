/*1.Write a java program which accept number from user and return the count of odd digits. 
Input :  2395  Output :  3 
Input :  1018 Output :  2 
Input :  -1018 Output :  2 
Input :  8462 Output :  0 */

import java.util.*;

class Digit 
{  
    public int CountOdd(int iNo)  
    {   
        int iCnt = 0, iDig = 0;
        if(iNo == 0)
        {  return 1;  }

        
        if(iNo < 0)
        {  iNo = -iNo;  }

        while(iNo > 0)
        {
            iDig = iNo % 10;
            if((iDig % 2) != 0)
            {
                iCnt++;
            }
            iNo = iNo / 10;
        }
        return iCnt; 
    } 
}

class Assignment33_2
{
    public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number :");
		
		int iValue = sobj.nextInt();
		
		Digit dobj = new Digit();
		
		int iRet = dobj.CountOdd(iValue);
		System.out.println("count of odd digit is :"+iRet);
	}
}