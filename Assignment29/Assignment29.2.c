/*2. Write a program which accept one number and
position from user and off that bit. Return modified number. 
Input :  10 2 
Output :  8   */

#include<stdio.h>
typedef unsigned int UINT;

UINT OffBit(UINT iNo, int iPos)
{
    UINT iMask = 0X00000001;
    UINT iResult = 0;

    iMask = iMask<<(iPos-1);
    iResult = iNo ^ iMask;

    return iResult;
} 

int main()
{
	UINT iValue = 0;
	UINT iBit = 0;
	UINT iRet = 0;

	printf("Enter number\n");
	scanf("%d",&iValue);

	printf("Enter position\n");
	scanf("%d",&iBit);
 
    iRet = OffBit(iValue, iBit);
    printf("Modified number is:%d",iRet);

    return 0;
}