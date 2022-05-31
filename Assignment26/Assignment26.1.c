/*1. Write a program which accept string from user and 
copy that characters of that string into another string in reverse order. 
Input :   “Marvellous Python” 
Output :   “nohtyP suollevraM”  */

#include<stdio.h> 
#include<string.h>
void StrCpyRev(char *src, char *dest)
{
   
} 
int main()
{
  char arr[30] = "Marvellous Python";
  char brr[30];   // Empty string
  StrCpyRev(arr,brr);
  printf("%s",brr);  // nohtyP suollevraM
  return 0;
}