/*4. Write a program which accept one number , two positions from user and
check whether bit at first or bit at second position is ON or OFF. 
Input :  10 3 7 
Output :  TRUE */

#include<stdio.h>
#include<stdbool.h>
typedef unsigned int UINT;
typedef bool BOOL;

BOOL ChkBit(UINT iNo, int iPos1, int iPos2)
{
	UINT iMask = 0x00000001;
	if(	((iNo&(iMask<<(iPos1-1))) == (iMask<<(iPos1-1))) || ((iNo&(iMask<<(iPos2-1))) == (iMask<<(iPos2-1))) 	)
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
	UINT iValue = 0, iPos1 = 0,  iPos2 = 0;
	bool bRet = false;
	
	printf("Enter the number");
	scanf("%d",&iValue);
	
	printf("Enter the number");
	scanf("%d",&iPos1);
	
	printf("Enter the number");
	scanf("%d",&iPos2);
	
	bRet =  ChkBit(iValue, iPos1, iPos2);
	if(bRet = true)
	{
		printf("Bit is On");
	}
	else
	{
		printf("Bit is Off");	
	}
	return 0;
}