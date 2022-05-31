/*4. Write a program which accept one number from user and toggle 7th and 10th bit of that number. Return modified number. 
Input :  137 
Output : 713 */

#include<stdio.h>
#include<stdbool.h>
typedef unsigned int UINT;

UINT OffBit(UINT iNo)
 {
    UINT iMask = 0;
    UINT iMask1 = 0X00000001;
    UINT iMask2 = 0X00000001;
    UINT iResult = 0;
   
    iMask1 = iMask1 << (7 -1);
    iMask2 = iMask2 << (10-1);
    iMask = iMask1 | iMask2;
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