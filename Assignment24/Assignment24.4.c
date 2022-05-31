/*4.Write a program which accept string from user and accept one character. 
Return index of last occurrence of that character. 
Input :   “Marvellous Multi OS”    M 
Output :   11 
Input :   “Marvellous Multi OS”    W 
Output :   -1 
Input :   “Marvellous Multi OS”    e 
Output :   4 */

#include<stdio.h>
#include<string.h>
int LastChar(char *str, char ch) 
{
   int i=0;
   for(i= (strlen(str)-1); i>=0; i--)
   {
   	  if(str[i]==ch)
   	  	{break; }
   }
   if (str[i] == strlen(str))
   	{return -1;  }
   else
   	{return i;   }
} 
int main() 
{  
	char arr[20];  
	char cValue;  
	int iRet = 0;    
	printf("Enter string");
	scanf("%[^'\n']s",arr); 
	fflush(stdin);
    printf("Enter the character");  
    scanf("%c",&cValue); 
    iRet = LastChar(arr, cValue); 
    printf("Character location is %d",iRet); 
    return 0; 
} 