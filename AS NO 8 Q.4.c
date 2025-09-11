//4. Find odd and even among the numbers.

#include<stdio.h>
void main(){
	int a[10];
	printf("Enter the array:");
	for(int i=0;i<10;i++){
		scanf("%d",&a[i]);
	}
	//Display the array;
	printf("Display the array:");
	for(int i=0;i<10;i++){
		printf("%d ",a[i]);
	}
	
	printf("\neven numbers:");
	for(int i=0;i<10;i++){
		if(a[i]%2==0)
		printf("%d ",a[i]);
	}
	
	printf("\nodd numbers:");
	for(int i=0;i<10;i++){
		if(a[i]%2!=0)
		printf("%d ",a[i]);
	}
}