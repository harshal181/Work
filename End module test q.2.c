#include<stdio.h>
#include<string.h>
void main (){
	char abc[200];
	printf("Enter the string:");
	scanf(" %[^\n]",abc);
	getchar();
	
	char ch;
	printf("Enter the ch:");
	scanf("%c",&ch);
	
	int count=0;
	for(int i=0;abc[i]!='\0';i++){
	if(abc[i]==ch){
		count++;
	}
}
printf("Count=%d",count);
}