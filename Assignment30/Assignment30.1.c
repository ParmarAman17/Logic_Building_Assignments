/*1.Write a program which accept one number from user and 
count number of ON (1) bits in it without using % and / operator. 
Input :  11 
Output :  3   */

#include<stdio.h>
typedef unsigned int UINT;   

UINT CountOne(UINT iNo) 
{
  int iCnt = 0;
  while(iNo > 0)
  {
    if((iNo & 1) == 1)
    {
       iCnt++;
    }
    iNo = iNo >> 1;
  }
  return iCnt;
} 

int main()
{
	UINT iValue = 0;
  UINT iRet = 0;
	printf("Enter number\n");
	scanf("%d",&iValue);

  iRet = CountOne(iValue);
  printf("Number of ON (1) bits are:%d",iRet);
  return 0;
}