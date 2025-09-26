//Que : Create array using malloc in Assignment 8
//1. Find minimum and maximum number in array.

#include<stdio.h>
#include <stdlib.h>


void demo(int* arr ,int a);
void main(){
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	
	int* arr=(int*)malloc(a*sizeof(int));
	printf("Enter the element in the array:");
	for(int i=0;i<a;i++){
		scanf("%d",&arr[i]);
	}
	
	printf("\nDisplay the array:");
	for(int i=0;i<a;i++){
		printf("%d ",arr[i]);
		
	}
	demo(arr,a);
}

void demo(int* arr ,int a){

if(arr==NULL){
	printf("null");
	return;
}
	
int max=arr[0];
int min=arr[0];

for(int i=0;i<a;i++){
	if(max<arr[i])
	max=arr[i];
}

for(int i=0;i<a;i++){
	if(min>arr[i])
	min=arr[i];
}
printf("\nminimum val=%d",min);
printf("\nmaxim val=%d",max);
}