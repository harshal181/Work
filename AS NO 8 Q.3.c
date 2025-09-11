//3. Find sum of all numbers.

#include<stdio.h>
void main(){
	int a[10];
	printf("Enter the array:");
	for(int i=0;i<10;i++){
		scanf("%d",&a[i]);
	}
	printf("Display the array:");
	int sum=0;
	for(int i=0;i<10;i++){
		printf("%d ",a[i]);
		sum=sum+a[i];
	}
	
	printf("\nSum= %d",sum);
}