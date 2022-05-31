/*1. Write application which accept file name from user and 
open that file in read mode. 
Input :  Demo.txt 
Output :  File opened successfully.*/

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

	fd = open(Fname,O_RDWR);

	if(fd == -1)
	{
		printf("Unable to open file\n");
		return -1;
	}
	else
	{
		printf("File opened successfully\n");
	}
	return 0;
} 