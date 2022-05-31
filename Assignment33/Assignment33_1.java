/*1.Write a java program which accept number from user and return the count of even digits. 
Input :  2395  Output :  1 
Input :  1018 Output :  2 
Input :  -1018 Output :  2 
Input :  8462 Output :  4 */

import java.util.*;

class Digit 
{  
    public int CountEven(int iNo)  
    {   
        int iCnt = 0, iDig = 0;
        if(iNo == 0)
        {  return 1;  }

        
        if(iNo < 0)
        {  iNo = -iNo;  }

        while(iNo > 0)
        {
            iDig = iNo % 10;
            if((iDig % 2) == 0)
            {
                iCnt++;
            }
            iNo = iNo / 10;
        }
        return iCnt; 
    } 
}

class Assignment33_1
{
    public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number :");
		
		int iValue = sobj.nextInt();
		
		Digit dobj = new Digit();
		
		int iRet = dobj.CountEven(iValue);
		System.out.println("count of even digit is :"+iRet);
	}
}