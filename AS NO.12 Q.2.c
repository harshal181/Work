//2. Search the given number in array.

#include<stdio.h>
#include<stdlib.h>
int ab(int* abc,int a,int b);
void main(){
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	
	int* abc=(int*) malloc(a*sizeof(int));
	if(abc==NULL){
		printf("not found");
		return;
	}
	printf("\nEnter the element in the array:");
	for(int i=0;i<a;i++){
		scanf("%d",&abc[i]);
	}
	printf("\nDisplay the element:");
	for(int i=0;i<a;i++){
		printf("%d ",abc[i]);
	}
	int b;
	printf("\nEnter the b:");
	scanf("%d",&b);
	int check=ab(abc,a,b);
	if(check==-1)
	printf("not found");
	else
	printf("\nthe %d is found at %d position",b,check);
}
int ab(int* abc,int a,int b){
	
	int pos=-1;
	for(int i=0;i<a;i++){
		if(abc[i]==b)
		pos=i;
	}
	if(pos==-1)
	return -1;
	else return 
	pos;
}