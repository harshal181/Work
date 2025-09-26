//8. Merge two arrays;

#include<stdio.h>
#include<stdlib.h>

void main(){
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	
	int* arr=(int*) malloc(a*sizeof(int)); //20
	int* brr=(int*) malloc(a*sizeof(int)); //20
	int* crr=(int*) malloc((a+a)*sizeof(int)); //40
	;
	printf("\nEnter the element in first array:");
	
	for(int i=0;i<a;i++){
		scanf("%d",&arr[i]);
	}
	
	printf("\nDisplay the second array:");
	for(int i=0;i<a;i++){
		printf("%d ",arr[i]);
	}
	
	printf("\nEnter the element in second array:");
	
	for(int i=0;i<a;i++){
		scanf("%d",&brr[i]);
	}
	
	printf("\nDisplay the second array:");
	for(int i=0;i<a;i++){
		printf("%d ",brr[i]);
	}
	
	printf("\nthird array:");
	 for(int i=0;i<a;i++){
	 	crr[i]=arr[i];
		 	 }
		 	 
	for(int i=0;i<2*a;i++){
		crr[i+a]=brr[i];
	}
	
	
	for(int i=0;i<2*a;i++){
		printf("%d ",crr[i]);
	}

 
}