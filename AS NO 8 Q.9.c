//9. Reverse the given array.

#include<stdio.h>
void main(){
	int a[10];
	printf("Enter the array:");
	for(int i=0;i<10;i++){
		scanf("%d",&a[i]);
	}
	printf("\nOrginal array:");
	for(int i=0;i<10;i++){
		printf("%d ",a[i]);
	}
	printf("\nReverse array:");
	for(int i=9;i>=0;i--){
	printf("%d ",a[i]);
	}
}