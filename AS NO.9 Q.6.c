//9. Reverse the given array.

#include<stdio.h>
void revarray();
void main(){
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	
	int arr[a];
	printf("Enter the array:");
	for(int i=0;i<a;i++){
		scanf("%d",&arr[i]);
	}
	
	printf("\nDisplay the array:");
	for(int i=0;i<a;i++){
		printf("%d ",arr[i]);
	}
	revarray(a,arr);
}
void revarray(int a,int* arr){
	printf("\nreverse array:");
	for(int i=a-1;i>=0;i--){
		printf("%d ",arr[i]);
	}
	}

