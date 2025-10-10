#include<stdio.h>
#include<stdlib.h>
#include<string.h>


//4. WAP to Form a New String where the First Character and the Last Character have been Exchanged

void main(){
char abc[100];
printf("Enter the string=");
scanf("%[^\n]",abc);

int len=strlen(abc);
char tmp;
if(len>1){
	tmp=abc[0];
	abc[0]=abc[len-1];
	abc[len-1]=tmp;
}
printf("\nmodified string=%s ",abc);
 
}