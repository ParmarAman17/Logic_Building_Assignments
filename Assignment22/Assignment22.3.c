
/*3. Write a program which accept string from user and return difference between 
frequency of small characters and frequency of capital characters. 
Input :   “MarvellouS” 
Output :   6 (8-2)  */

#include<stdio.h>
int Difference(char *str) 
{  
    int Ccount = 0, Scount = 0; 
     
    while(*str != '\0')  
    {
         if((*str >= 'A') && (*str <= 'Z'))
        {
            Ccount++;
        }
        
        else if((*str >= 'a') && (*str <= 'z'))
        {
            Scount++;
        }
        str++;
    } 
    return Scount - Ccount ; 
} 
int main() 
{  
    char arr[20];  
    int iRet = 0; 
    printf("Enter string\n");  
    scanf("%[^'\n']s",arr); 
    iRet = Difference(arr); 
    printf("%d",iRet); 
    return 0; 
} 
