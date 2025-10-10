//2. WAP Replace all Occurrences of ‘a’ with $ in a String

#include<stdio.h>
#include<string.h>
void main(){
	char abc[100];
	printf("Enter the string:");
   scanf(" %[^\n]",abc);
	
	for(int i=0;i<strlen(abc);i++){
     if(abc[i]=='a'){
     	abc[i]='$';
	 }
}

printf("modified string:%s",abc);
}