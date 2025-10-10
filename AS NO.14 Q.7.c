//7. WAP to Take in a String and Replace Every Blank Space with special symbol.

#include<stdio.h>
#include<string.h>
#include<stdlib.h>
void main(){
	char abc[]="This is a programming laguage";
	
	for(int i=0;abc[i]!=0;i++){
		if(abc[i]==' '){
			abc[i]='$';
		}
	}
	printf("abc=%s",abc);
}