//4. Find odd and even among the numbers.

#include<stdio.h>
void evenodd(int a,int* arr);

void main(){
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	
	printf("\nEnter the array:");
	int arr[a];
	for(int i=0;i<a;i++){
	scanf("%d",&arr[i]);
}
	printf("\nDisplay the array:");
	for(int i=0;i<a;i++){
		printf("%d ",arr[i]);
	}
	 evenodd(a,arr);
}

void evenodd(int a,int* arr){
	printf("\neven numbers");
	for(int i=0;i<a;i++){
		if(arr[i]%2==0){
			printf("%d ",arr[i]);
		}
	}
	
	printf("\nodd numbers:");
	for(int i=0;i<a;i++){
		if(arr[i]%2!=0){
			printf("%d ",arr[i]);
		}
	}
	

	
	
}