/*1.Write a program which checks whether 15th bit is On or OFF.*/

#include<stdio.h>
#include<stdbool.h>
typedef unsigned int UINT;

bool CheckBit(UINT iNo)
{
    UINT iMask = 0x00004000;    //0000 0000 0000 0000 0100 0000 0000 0000
    UINT iResult = 0;           //  0   0    0     0    4    0    0    0

    iResult = iNo & iMask;
    if(iResult == iMask)
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
		printf("15th bit is on");
	}
	else
	{
		printf("15th bit is off");
	}
	return 0;
}