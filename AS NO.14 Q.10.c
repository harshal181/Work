//10. WAP to Take in Two Strings and Display the Larger String without Using Built-in Functions

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
void main(){
	char abc[]="right";
	char pqr[]="always right";
	int len1=0;
	int len2=0;
	
	for(int i=0;abc[i]!=0;i++){
	len1++; 
 }

  for(int j=0;pqr[j]!=0;j++){
	len2++;
  }
  if(len1<len2)
  printf("pqr is greater");
  else
  printf("abc is greater");
}