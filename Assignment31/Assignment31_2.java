/*2. Write a java  program which accept string from user and count number of small characters. 
Input :   "Marvellous"
Output :   9 */

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
    public int CountSmall()  
    {  
        char Arr[] = str.toCharArray();
        int iCnt = 0, i = 0;
        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if((Arr[iCnt]>='a') && (Arr[iCnt]<='z'))
            {
                i++;
            }
        }
        return i;
    } 
} 
class Assignment31_2
{
    public static void main(String[] args)
    {
        StringDemo sdobj = new StringDemo();
        sdobj.Accept();

        int iRet = 0;
        iRet = sdobj.CountSmall();
        System.out.println("Number of small characters are:"+iRet);
    }
    
}