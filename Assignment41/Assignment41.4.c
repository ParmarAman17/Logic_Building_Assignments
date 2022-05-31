/*4. Write application which accept file name from user and 
display size of file. 
Input :  Demo.txt 
Output :  File size is 56 bytes*/

#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
	int fd = 0, iRet = 0, iSum = 0;
	char Fname[30];
	char Buffer[10];

	printf("Enter file name\n");
	scanf("%s",Fname);

    fd = open(Fname,O_RDWR);
    if(fd == -1)
    {
    	printf("Unable to open the file\n");
        return -1;
    }

	iRet = lseek(fd,0,2);
	/*while((iRet = read(fd,Buffer,10)) != 0)
	{
		iSum = iSum + iRet;
	}*/

	printf("The size of file is:%d",iRet);
    close(fd);
	return 0;
} 