/*3. Write application which accept file name from user and 
read all data from that file and display contents on screen. 
Input :  Demo.txt 
Output :  Display all data of file.*/

#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
	int fd = 0, iRet = 0;
	char Fname[30];

	printf("Enter file name\n");
    scanf("%s",Fname);

    fd = open(Fname,O_RDWR);

    if(fd == -1)
	{
		printf("Unable to open file\n");
		return -1;
	}

    iRet = read(fd,Fname,6);

    write(1,Fname,iRet);

    //printf("Data from file is :%s\n",Fname);

    return 0;
} 