//8. WAP to Remove the Characters of Odd Index Values in a String

#include<stdio.h>
#include<string.h>
#include<stdlib.h>
void main(){
	char abc[]="Thisisc";
	int j=0;
	for(int i=0;abc[i]!='\0';i++){
	if(i%2==0){
		abc[j]=abc[i];
		j++;
	}	
	}
	abc[j]='\0';
	printf("abc=%s",abc);
}