/*5. Write application which accept file name from user and 
one string from user. Write that string at the end of file. 
Input :  Demo.txt   Hello World 
Output :  Write Hello World at the end of Demo.txt file */


#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
	int fd = 0, iRet = 0;
	char Fname[30];
	char Data[30] = "Hello World";

	printf("Enter file name\n");
	scanf("%s",Fname);

	/*printf("Enter string\n");
	scanf("%s",Data);*/

	fd = open(Fname,O_RDWR);
	if(fd == -1)
	{
		printf("Unable to oepn file\n");
		return -1;
	}
    
    lseek(fd,0,2);
	write(fd,Data,11);

 

    return 0;
}