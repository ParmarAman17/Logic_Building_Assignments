/*2. Write a program which checks whether 5th & 18th bit is On or OFF.*/

#include<stdio.h>
#include<stdbool.h>
typedef unsigned int UINT;

bool CheckBit(UINT iNo)
{
	UINT iMask = 0x00020010;    //0000 0000 0000 0010 0000 0000 0001 0000
	UINT iResult = 0;           // 0    0    0    2    0    0    1    0

	iResult = iNo & iMask;
	if(iMask == iResult)
	{
		return true;
	}
	else
	{
		return false;
	} 
}

int main()
{
	UINT iValue = 0;
    bool bRet = false;

	printf("Enter number\n");
	scanf("%d",&iValue);
    
    bRet = CheckBit(iValue);

    if(bRet == true)
    {
    	printf("5th and 18th bit is ON");
    }
    else
    {
    	printf("5th and 18th bit is OFF");
    }
    return 0;
}