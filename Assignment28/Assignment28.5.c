/*5. Write a program which accept one number from user and on its first 4 bits. Return modified number. 
Input :  73 
Output : 79  */

#include<stdio.h>
//#include<stdbool.h>
typedef unsigned int UINT;

UINT OnBit(UINT iNo) 
{
    UINT iMask = 0X0000000F;  // iNo = 0000 0000 0000 0000 0000 0000 0100 1001
    UINT iResult = 0;       // iMask = 0000 0000 0000 0000 0000 0000 0000 1111
                            // iMask =  0    0     0    0    0    0    0    F   (in Hex formate)
    iResult = iNo | iMask;
    return iResult;
} 
int main()
{
	UINT iValue = 0;
	UINT iRet = 0;

	printf("Enter number\n");
	scanf("%d",&iValue);

	iRet = OnBit(iValue);

	printf("Modified number is:%d",iRet);
	return 0;
}