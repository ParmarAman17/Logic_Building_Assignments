/*3. Write a program which accept string from user and 
display it in reverse order. 
Input :   “MarvellouS” 
Output :   “SuollevraM” */

#include<stdio.h>

/*int Strlenx(char *str)
{
   int iCnt = 0;
   if(str==NULL)
   { 
   return 0;
   }
   while(*str!='\0')
   {
      iCnt++;
      str++;
   }
   return iCnt;
}

void Reverse(char *str) 
{
   int i = 0;
   if(str==NULL)
   {  return ; }
   
   /*if((Strlenx(str))<=0)
   {  return 0;   }*/

  /* for(i = (Strlenx(str)-1);i>=0;i--)
   {
      printf("%c",str[i]);
   }
    
} 
int main() 
{  
	char arr[20];  
	int iRet = 0; 
    printf("Enter string");  
    scanf("%[^'\n']s",arr);    
    Reverse(arr); 
    return 0; 
}*/

void Reverse(char *str)
{
   char temp='\0';
   char *end='\0';
   end=str;

   while(*end!='\0')
   {
      end++;
   }
   end--;

   while(str<end)
   {
      temp = *str;
      *str=*end;
      *end=temp;
      str++;
      end--;
   }
}
int main() 
{  
   char arr[20];  
   int iRet = 0; 
    printf("Enter string");  
    scanf("%[^'\n']s",arr);    
    Reverse(arr); 
    printf("Reverse string is %s:",arr);
    return 0; 
}
