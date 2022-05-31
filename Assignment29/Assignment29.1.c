/*1.Write a program which accept one number and position from user and 
check whether bit at that position is on or off. 
If bit is one return TURE otherwise return FALSE.   
Input :  10 2 
Output :  TRUE */

#include<stdio.h>
#include<stdbool.h>
typedef unsigned int UINT;
typedef int BOOL;
//#define TRUE 1;
//#define FALSE 0;

BOOL ChkBit(UINT iNo, UINT iPos)
{
   UINT iResult = 0;
   UINT iMask = 0x00000001;

   if((iPos < 1) || (iPos > 32))
    {
        return false;
    }

   iMask = iMask << (iPos - 1);
   iResult = iNo & iMask;
    
    if(iResult == iMask)
    {   return true; }
    else
    {    return false;  }

}

int main()
{
   BOOL bRet = false;
   UINT iValue = 0;
   UINT iBit = 0;

   printf("Enter number\n");
   scanf("%d",&iValue);

   printf("Enter position\n");
   scanf("%d",&iBit);

   bRet = ChkBit(iValue,iBit);

   if(bRet == true)
   {
   	 printf("TRUE");
   }
   else
   {
   	printf("FALSE");
   }
   return 0;
} 