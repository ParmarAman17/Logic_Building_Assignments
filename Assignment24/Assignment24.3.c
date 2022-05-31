/*3.Write a program which accept string from user and accept one character. 
Return index of first occurrence of that character. 
Input :   “Marvellous Multi OS”    M 
Output :   0 
Input :   “Marvellous Multi OS”    W 
Output :   -1 
Input :   “Marvellous Multi OS”    e 
Output :   4 */

#include<stdio.h>
#include<string.h>
int FirstChar(char str[], char ch) 
{   
   int i=0;
   for(i=0; i< strlen(str); i++)
   {
      if(str[i] == ch)
      {
         break;
      }
   }
    if(i == strlen(str))
    {return -1;  }
    
    else
    {return i;   } 
} 
int main() 
{  
	char arr[20];  
	char cValue;  
	int iRet = 0;    
	printf("Enter string\n");  
	scanf("%[^'\n']s",arr); 
   fflush(stdin);
   printf("Enter the character\n");  
   scanf("%c",&cValue); 
   iRet = FirstChar(arr, cValue); 
   printf("Character location is %d",iRet); 
   return 0;
 }


