/*5. Write a program which accept one number from user and 
range of positions from user. Toggle all bits from that range. 
Input : 897  9 13 Toggle all bits from position 9 to 13 of input number ie 879.  */

#include<stdio.h>
typedef unsigned int UINT;


UINT ToggleBitRange(UINT iNo, int iStart, int iEnd)
{
	UINT iMask = 0x00000001, iMask1 = 0;
	while(iStart<=iEnd)
	{
        iMask1=iMask1|(iMask<<(iStart-1));
		iStart++;
	}
	return (iNo ^ iMask1);
}

int main()
{
	UINT iValue = 0, iReg1 = 0,  iReg2 = 0 , iRet = 0;
	
	printf("Enter the number");
	scanf("%d",&iValue);
	
	printf("Enter the number");
	scanf("%d",&iReg1);
	
	printf("Enter the number");
	scanf("%d",&iReg2);
	
	if( (iReg1<1) || (iReg1>32) || (iReg2<1) || (iReg2>32) || (iReg1>iReg2) )
	{
		printf("Invalid Number ");
	}
	else
	{
		iRet =  ToggleBitRange(iValue, iReg1, iReg2);

		printf("Modified number is : \n%d", iRet);
	}
	return 0;
}
