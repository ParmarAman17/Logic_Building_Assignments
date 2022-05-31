/*5. Write a program which accept string from user and 
copy that characters of that string into another string by toggling the case. 
Input :   “Marvellous Python 2” 
Output :   “mARVELLOUS pYTHON 2” */

#include<stdio.h>
void StrCpyToggle(char *src, char *dest)
{
  if(src==NULL)
	{ return ;}
	while(*src !='\0')
	{
		if( (*src>='A') && (*src<='Z') )
		{
		*dest =(*src + 32);
		}
		else if( (*src>='a') && (*src<='z') )
		{
		*dest =(*src - 32);
		}
		else
		{ *dest = *src;	}
		*dest++;
		*src++;
	}
	*dest = '\0';
} 
int main()
 {  
 	char arr[30] = "Marvellous Python 2";
   char brr[30];   // Empty string
   StrCpyToggle(arr,brr);
   printf("%s",brr);  // mARVELLOUS pYTHON 2    
   return 0; 
}