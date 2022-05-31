/*3. Write a program which accept one number from user and 
check whether 9th or 12th bit is on or off. 
Input :  257  
Output :  TRUE  */

#include<stdio.h>
#include<stdbool.h>
typedef unsigned int UINT;

bool ChkBit(UINT iNo)
{
	UINT iMask = 0x00000001;
	if(	((iNo&(iMask<<8)) == (iMask<<8)) || ((iNo&(iMask<<11)) == (iMask<<11)) 	)
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
	
	printf("Enter the number");
	scanf("%d",&iValue);
	
	bRet =  ChkBit(iValue);
	if(bRet = true)
	{
		printf("Bit is On");
	}
	else
	{
		printf("Bit is Off");	
	}
}