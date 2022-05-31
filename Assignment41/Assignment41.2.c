/*2. Write application which accept file name from user and 
create that file. 
Input :  Demo.txt 
Output :  File created successfully.*/

#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
	int fd = 0;
char Fname[30];

printf("Enter file name\n");
scanf("%s",Fname);

fd = creat(Fname,0777);

if(fd == -1)
{
	printf("Unable to create file\n");
	return -1;
}
else
{
	printf("File created successfully\n");
}
return 0;
}
