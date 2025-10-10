//3. Write a program to check the string is palindrome or not.
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

void main(){
	char abc[]="This is a si sihT";
	char pqr[strlen(abc)+1];
	strcpy(pqr,abc);
	strrev(abc);
	
	if(strcmp(pqr,abc)==0){
		printf("palindrome");
	}
	else{
		printf("not palindrome");
	}
}