//6. WAP to Count the Number of Vowels in a String
#include<stdio.h>
#include<string.h>
#include<stdlib.h>
void main(){
	char abc[]="This is a programming language";
	
	int count=0;
		  for(int i=0;abc[i]!=0;i++){
		  	if(abc[i]=='a'||abc[i]=='e'||abc[i]=='i'||abc[i]=='o'||abc[i]=='u'){
		  		count++;
			  }
		  }
		  printf("count=%d",count);
	}
