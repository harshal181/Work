//5. Print alternate elements in array.

#include<stdio.h>
void main(){
	int a[10];
	printf("Enter the array:");
	for(int i=0;i<10;i++){
		scanf("%d",&a[i]);
	}
	printf("Display the array:");
	for(int i=0;i<10;i++){
		printf("%d ",a[i]);
	}
	printf("\nalternate elements in array:");
	for(int i=0;i<10;i=i+2){
		printf("%d ",a[i]);
	}
	
	printf("\nalternate elements in array:");
	for(int i=1;i<10;i=i+2){
		printf("%d ",a[i]);
	}
	
}