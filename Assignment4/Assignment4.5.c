/*5.Write a program which accept number from user and return difference between summation of all its factors and non factors. 
Input :  12 Output : -34  (16 - 50)  
Input :  10  Output : -29 (8 - 37) */
 
#include<stdio.h> 
int FactDiff(int iNo)
{
    int i=0, iFact=0, iNfact=0, iSum=0;
	for(i=1; i<iNo; i++)
	{
		if((iNo%i)==0)
			{
				iFact=iFact+i;
			}
			else if((iNo%i)!=0)
				{
					iNfact=iNfact+i;
				}
				iSum=iFact-iNfact;
	}
	return iSum;
} 
int main()
{
	int iValue = 0;
	int iRet = 0; 
    printf("Enter number\n");
	scanf("%d",&iValue); 
    iRet  = FactDiff(iValue); 
    printf("%d",iRet); 
    return 0; 
} 
 