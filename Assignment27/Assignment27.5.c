/*5. Write a program which checks whether first and last bit is On or OFF. First bit means bit number 1 and last bit means bit number 32.*/

#include<stdio.h>
#include<stdbool.h>
typedef unsigned int UINT;

bool CheckBit(UINT iNo)
{
	UINT iMask = 0x80000001;   //1000 0000 0000 0000 0000 0000 0000 0001
	UINT iResult = 0;          // 8     0    0    0    0    0    0    1

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
    	printf("1st and 32th bit is ON");
    }
    else
    {
    	printf("1st and 32th bit is  OFF");
    }
    return 0;
}