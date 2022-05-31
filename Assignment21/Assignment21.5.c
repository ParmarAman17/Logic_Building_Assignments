/*5. Accept character from user and 
display its ASCII value in decimal, octal and hexadecimal format. 
Input :   A 
Output :  Decimal      65 
          Octal        0101    
          Hexadecimal  0X41  */

#include<stdio.h> 
void Display (char c) 
{   
     if(((c >= 'A') && (c <= 'Z'))||((c >= 'a') && (c <= 'z')))
        {
            printf("Decimal:%d\n",c);
            printf("Octal:%o\n",c);
            printf("Hexadecimal:%x\n",c);
        }
} 

int main()
{  
    char cValue = '\0'; 
    printf("Enter the character\n");  
    scanf("%c",&cValue); 
    Display(cValue);
    return 0; 
}
