/*4. Write a program which checks whether 7th & 8th & 9th bit is On or OFF.*/

#include<stdio.h>
#include<stdbool.h>
typedef unsigned int UINT;

bool CheckBit(UINT iNo)
{
	UINT iMask = 0x000001c0;   //0000 0000 0000 0000 0000 0001 1100 0000
	UINT iResult = 0;          // 0     0    0    0    0    1    c    0

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
    	printf("7th,8th and 9th bit is ON");
    }
    else
    {
    	printf("7th,8th and 9th bit is OFF");
    }
    return 0;
}