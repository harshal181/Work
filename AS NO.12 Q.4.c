//4. Find odd and even among the numbers.

#include<stdio.h>
#include<stdlib.h>
void even(int* arr,int a);
void odd(int* arr,int a);

void main(){
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	
	int* abc=(int*) malloc(a*sizeof(int));
	
	printf("\nEnter the element in the array:");
	for(int i=0;i<a;i++){
		scanf("%d",&abc[i]);
	}
	
	printf("\nDisplay the array:");
	for(int i=0;i<a;i++){
		printf("%d ",abc[i]);
	}
	 even(abc,a);
	 odd(abc,a);
}

void even(int* arr,int a){
	printf("\neven numbers:");
	for(int i=0;i<a;i++){
		if(arr[i]%2==0){
			printf("%d ",arr[i]);
		}
	}
}

void odd(int* arr,int a){
	printf("\nodd numbers:");
	for(int i=0;i<a;i++){
		if(arr[i]%2!=0){
        printf("%d ",arr[i]);			
		}
	}
}