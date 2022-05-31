/*1.Write a Java program which accept string from user and count number of capital characters. 
Input :   "Marvellous Multi OS" 
Output :   4 */

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
      public int CountCapital()  
      {  
            char Arr[] = str.toCharArray();
            int iCnt = 0, i = 0;
            for(i=0; i<Arr.length; i++)
            {
                if((Arr[i]>='A') && (Arr[i]<='Z'))
                {
                    iCnt++;
                }
            }
            return iCnt;
      } 
}

class Assignment31_1
{
    public static void main(String[] args) 
    {
        StringDemo sdobj = new StringDemo();
        sdobj.Accept();

        int iRet = sdobj.CountCapital();
        System.out.println("Number of capital characters are:"+iRet);
    }
}