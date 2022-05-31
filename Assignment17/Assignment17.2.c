/*2. Accept N numbers from user and return difference between frequency of even number and odd numbers. 
Input :  N :   7 
  Elements : 85 66 3 80 93 88 90 
Output : 1 (4 -3)   Program Layout :    */

#include<stdio.h> 
#include<stdlib.h>

int Frequency(int Arr[], int iLength)
{
   int iResult=0, iCnt=0, iEven=0, iOdd=0, i1=0, i2=0;
   for(iCnt=0; iCnt<iLength; iCnt++)
   {
    if((Arr[iCnt]%2)==0)
    {
       iEven=iEven+Arr[iCnt];
       i1++;
    }
    else
    {
      iOdd=iOdd+Arr[iCnt];
      i2++;
    }
   }
   return iResult = i1 - i2;
} 
int main()
{
  int iSize = 0,iRet = 0,iCnt = 0;  
  int *p = NULL; 
  printf("Enter number of elements\n");  
  scanf("%d",&iSize); 
  p = (int *)malloc(iSize * sizeof(int)); 
  if(p == NULL)  
    {   
      printf("Unable to allocate memory");   
      return -1;  
    } 
  printf("Enter elements\n"); 
  for(iCnt = 0;iCnt<iSize; iCnt++)  
    {      
      scanf("%d",&p[iCnt]);  
    } 
  iRet = Frequency(p, iSize);   
  printf("Result is %d",iRet); 
  free(p); 
  return 0; 
}