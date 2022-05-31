/*4. Write a program which accept one number and
and toggle contents of first and last nibble of the number. 
Return modified number.(Nibble is a group of four bits)  */

#include<stdio.h>
typedef unsigned int UINT;

UINT ToggleBit(UINT iNo)
{
    UINT iMask = 0Xf000000f;
    UINT iResult = 0;

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
    printf("Modified number is:%u",iRet);

    return 0;
}