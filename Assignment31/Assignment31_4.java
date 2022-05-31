/*4. Write a java program which accept string from user and 
check whether it contains vowels in it or not. 
Input :   "marvellous"
Output :   TRUE 
Input :   "Demo" 
Output :   TRUE 
Input :   "xyz" 
Output :   FALSE */

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
    public boolean ChkVowel()  
    {  
        char Arr[] = str.toCharArray();
        int i = 0;
        boolean bFlag = false;
        for(i = 0; i<Arr.length; i++)
        {
            if((Arr[i] == 'a') || (Arr[i] == 'e') || (Arr[i] == 'i') || (Arr[i] == 'o') || (Arr[i] == 'u'))
            {
                bFlag = true;
                break;
            }
        }
        return bFlag;
    } 
}

class Assignment31_4
{
    public static void main(String[] args) 
    {
        StringDemo sdobj = new StringDemo();
        sdobj.Accept();
        
        boolean bRet = false;
        bRet = sdobj.ChkVowel();
        if(bRet == true)
        {
            System.out.println("It contains the vowels\n");
        }
        else
        {
            System.out.println("It not contains the vowels\n");
        }
    }
}