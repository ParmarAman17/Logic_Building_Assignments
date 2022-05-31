/*2. Write Java program which accept N numbers from user and display all such elements which are divisible by 3 & 5. 
Input :  N :   6 
Elements : 85 66 3 15 93 88  
Output : 15 */

import java.util.*;

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;
        System.out.println("Enter elements");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }
}

class ArrayDemo extends ArrayX
{
    public ArrayDemo(int iValue)
    {
        super(iValue);
    }

    public void Divide()
    {
        int iCnt = 0;
        System.out.println("The numbers are:");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt]%11)==0)
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}

class Assignment32_5
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iLength = 0, iRet = 0;

        System.out.println("Enter the number of element");
        iLength = sobj.nextInt();

        ArrayDemo adobj = new ArrayDemo(iLength);
        adobj.Accept();
        adobj.Divide();
        //System.out.println("Difference is: "+iRet);

    }
}

 