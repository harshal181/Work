//1. Write a program to scan string from user then scan a single character and search it in a accepted string.
#include<stdio.h>
#include<string.h>

void main(){
	 char abc[100];
    printf("Enter the string: ");
    scanf("%[^\n]", abc);  
    char ch;
    printf("Enter the character: ");
    scanf(" %c", &ch);
	char* pos=strchr(abc,ch);
	if(pos==NULL)
	printf("not found");
	else
	printf("found at %d pos",pos-abc);
}