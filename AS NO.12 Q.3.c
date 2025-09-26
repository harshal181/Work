//3. Find sum of all numbers.

#include<stdio.h>
#include <stdlib.h>
int total(int* arr,int a,int sum);
void main(){
	int a;
	printf("Enter rhe a:");
	scanf("%d",&a);
	
	int* arr=(int*) malloc(a*sizeof(int));
	
    printf("Enter the array:");
	for(int i=0;i<a;i++){
		scanf("%d",&arr[i]);
	}	
	
	printf("\nDisplay the array:");
	for(int i=0;i<a;i++){
		printf("%d ",arr[i]);
		
	}
	int sum=0;
	
 int check=total(arr,a,sum);
 printf("\nSum=%d",check);
	
	
}
int total(int* arr,int a,int sum){
	for(int i=0;i<=a;i++){
		sum=sum+arr[i];
	}
  return sum;
}