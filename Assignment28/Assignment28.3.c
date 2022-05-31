/*3. Write a program which accept one number from user and toggle 7th bit of that number. Return modified number. 
Input :  137 
Output : 201 */

#include<stdio.h>
#include<stdbool.h>
typedef unsigned int UINT;

UINT ToggleBit(UINT iNo)
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
   
   iRet = ToggleBit(iValue);
   printf("Modifiesd number is:%d",iRet);
   return 0;
 }