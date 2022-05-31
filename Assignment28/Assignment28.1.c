/*1.Write a program which accept one number from user and
off 7th bit of that number if it is on. Return modified number. 
Input :  79 
Output : 15  */

#include<stdio.h>
#include<stdbool.h>
typedef unsigned int UINT;

UINT OffBit(UINT iNo)
 {
    UINT iMask = 0X00000001;
    UINT iResult = 0;
   
    iMask = iMask << (7 -1);
    iResult = iNo ^ iMask;
    
    return iResult;
 }

 int main()
 {
 	 UINT iValue = 0;
   UINT iRet = 0;
   printf("Enter number\n");
   scanf("%d",&iValue);
   
   iRet = OffBit(iValue);
   printf("Modifiesd number is:%d",iRet);
   return 0;
 }