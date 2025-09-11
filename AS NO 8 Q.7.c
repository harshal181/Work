//7. Take two array and add sum in third array
//Example-
//arr[5]= {1,2, 3, 4,5}
//brr[5]={10,20,30, 40, 50}
//crr[5]={11,22,33,44,55}


#include<stdio.h>
void main(){
	int arr[5];
	printf("Enter the first array:");
	for(int i=0;i<5;i++){
		scanf("%d",&arr[i]);
	}
	printf("Display the first array:");
	for(int i=0;i<5;i++){
		printf("%d ",arr[i]);
	}
	printf("\n");
	int brr[5];
	printf("Enter the second array:");
	for(int i=0;i<5;i++){
		scanf("%d",&brr[i]);
	}
	printf("Display the second array:");
	for(int i=0;i<5;i++){
		printf("%d ",brr[i]);
	}
	
	printf("\n sum of the first & second array:");
    int crr[5];
    for(int i=0;i<5;i++){
    	crr[i]=arr[i]+brr[i];
    	printf("%d ",crr[i]);
	}
}