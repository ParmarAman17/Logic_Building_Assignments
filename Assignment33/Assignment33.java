/*1.Write a java program which accept number from user and return the count of even digits. 
Input :  2395  Output :  1 
Input :  1018 Output :  2 
Input :  -1018 Output :  2 
Input :  8462 Output :  4    */

import java.util.*;

class Number
{
    public int iNo;

    public int Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number\n");
        iNo = sobj.nextInt();
    }
}

class Digit extends Number
{  
    /*public Digit(int iValue)
    {
        super(iValue);
    }*/

    public int CountEven()  
    {   
        int i = super.iNo;
        int iCnt = 0, iDig = 0;
        if(i == 0)
        {  return 1;  }

        if(i < 0)
        {  i = -i;  }

        while(i > 0)
        {
            iDig = i % 10;
            if((iDig % 2) == 0)
            {
                iCnt++;
            }
            i = i / 10;
        }
        return iCnt;
    } 
} 

class Assignment33_1
{
    public static void main(String[] args) 
    {
         Digit dobj = new Digit();
         dobj.Accept(); 
         
         int iRet = dobj.CountEven();
         System.out.println("Number of even digits are:"+iRet);
    }
}