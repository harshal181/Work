//5. WAP to Remove the nth Index Character from a Non-Empty String

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
void main(){
	char abc[100];
	printf("Enter the string:");
	scanf(" %[^\n]",abc);
	getchar();
	fflush(stdin);
	int n;
	printf("\nEnter the n:");
	scanf("%d",&n);

	char temp;
	for(int i=n;abc[i]!=0;i++){
		abc[i]=abc[i+1];
	}

	printf("abc=%s",abc);
}