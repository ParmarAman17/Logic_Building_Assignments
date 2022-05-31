/*5. Write a java program which accept string from user and display it in reverse order. 
Input :   "MarvellouS" 
Output :   "SuollevraM"  */

import java.util.*;

class StringX
{
    public String str;
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string");
        str = sobj.nextLine();
    }
}

class StringDemo extends StringX
{
      public String Reverse()  
      {  
            char Arr[] = str.toCharArray();
            int iEnd = Arr.length-1;
            int iStart = 0;
            char temp;
            while(iStart<iEnd)
            {
                temp = Arr[iStart];
                Arr[iStart] = Arr[iEnd];
                Arr[iEnd] = temp;

                iStart++;
                iEnd--;
            }
            return (new String(Arr));
      } 
}

class Assignment31_5
{
    public static void main(String[] args) 
    {
        StringDemo sdobj = new StringDemo();
        sdobj.Accept();
    
        String sRet = sdobj.Reverse();
        System.out.println("Reverse string is:"+sRet);
    }
}