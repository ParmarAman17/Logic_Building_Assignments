/*5. Write a program which accept string from user reverse that string in place. 
Input :   “abcd” 
Output :   “dcba” 
Input :   “abba” 
Output :   “abba” */
 
#include<stdio.h>
 char StrRevX(char *str) 
 {
   
 } 
 int main() 
 {
   char arr[20];
   printf("Enter string");  
   scanf("%[^'\n']s",arr); 
   StrRevX(arr); 
   printf("Modified string is %s",arr); 
   return 0; 
} 