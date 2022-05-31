/*5.Write a program which accept number from user and return difference between summation of even digits and summation of odd digits. 
Input :  2395  Output :  -15 (2 - 17) 
Input :  1018 Output :  6 (8 - 2) 
Input :  8440 Output :  16  (16 - 0) 
Input :  5733 Output :  -18 (0 - 18)   */

#include<stdio.h> 
int CountDiff(int iNo)
{
	int iDigit=0, iEs=0, iOs=0, iDiff=0;
	while(iNo!=0)
	{
		iDigit=iNo%10;
		if((iDigit%2)==0)
		{
			iEs=iEs+iDigit;
		}	
		else if((iDigit%2)!=0)
		{
			iOs=iOs+iDigit;
		}
		iNo=iNo/10;
		iDiff=iEs-iOs;
	}
	return iDiff;
} 
int main()
{
	int iValue = 0;
	int iRet = 0; 
    printf("Enter number");
	scanf("%d",&iValue); 
    iRet = CountDiff(iValue); 
    printf("%d",iRet); 
    return 0;
}