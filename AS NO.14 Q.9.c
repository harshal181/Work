//9. WAP to Calculate the Number of Words Present in a String

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
void main(){
	char abc[]="This is a c";
	int count=1;
	for(int i=0;abc[i]!='\0';i++){
	
		if(abc[i]==' '||abc[i]=='\0'){
			count++;
		}
	}
	printf("Total Word=%d",count);
	
}