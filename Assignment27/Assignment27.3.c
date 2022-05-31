/*3. Write a program which checks whether 7th & 15th & 21st , 28th bit is On or OFF.*/

#include<stdio.h>
#include<stdbool.h>
typedef unsigned int UINT;

bool CheckBit(UINT iNo)
{
	UINT iMask = 0x08104040;   //0000 1000 0001 0000 0100 0000 0100 0000
	UINT iResult = 0;          // 0     8    1    0    4    0    4    0

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
    	printf("7th,15th,21st and 28th bit is ON");
    }
    else
    {
    	printf("7th,15th,21st and 28th bit is OFF");
    }
    return 0;
}