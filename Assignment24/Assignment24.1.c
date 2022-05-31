/*1.Write a program which accept string from user and accept one character. 
Check whether that character is present in string or not. 
Input :   “Marvellous Multi OS”    e 
Output :   TRUE myexe
Input :   “Marvellous Multi OS”    W 
Output :   FALSE   */

#include<stdio.h>
#include<stdbool.h>
#define TRUE 1 
#define FALSE 0 
typedef int BOOL; 

bool ChkChar(char *str,char ch)
{
    if(str==NULL)
    {
        return 0;
    }
    else
    {
      while(*str!='\0')
     {
        if(*str==ch)
        {
            break;
            return 1;
        }
        str++;
     }
    }
}
int main()
{
char arr[20];
char cValue;
bool bRet = FALSE;
printf("Enter string");
scanf("%[^'\n']s",arr);
fflush(stdin);
printf("Enter the character");
scanf("%c",&cValue); 
bRet = ChkChar(arr, cValue);
if(bRet == TRUE)
{
printf("Character found");
}
else
{
printf("Character not found");
}
return 0;
}