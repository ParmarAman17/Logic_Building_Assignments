/*3. Write a java program which accept string from user and return difference between frequency of small characters and
 frequency of capital characters. 
 Input :   "MarvellouS"
Output :   6 (8-2) */

import java.util.*;

class StringX
{
    public String str;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string\n");
        str = sobj.nextLine();
    }
}
class StringDemo extends StringX
{  
    public int CountDiff()  
    { 
              char Arr[] = str.toCharArray();
              int iCntCap = 0, iCntSmall = 0, i = 0;
              for(i=0; i<Arr.length; i++)
              {
                  if((Arr[i]>='A') && (Arr[i]<='Z'))
                  {
                      iCntCap++;
                  }
                  else if((Arr[i]>='a') && (Arr[i]<='z'))
                  {
                      iCntSmall++;
                  }
              }
              return iCntSmall - iCntCap;
            } 
} 

class Assignment31_3
{
    public static void main(String[] args) 
    {
        StringDemo sdobj = new StringDemo();
        sdobj.Accept();
        int iRet = 0;
        iRet = sdobj.CountDiff();
        System.out.println("Frequency is:"+iRet);
    }
}