//6. Accept array and print only prime numbers of array.

#include<stdio.h>
void prime(int a,int arr[]);
void main(){
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	
	int arr[a];
	printf("Enter the element in the array:");
	for(int i=0;i<a;i++){
		scanf("%d",&arr[i]);
	}
	printf("\nDisplay the array:");
	for(int i=0;i<a;i++){
		printf("%d ",arr[i]);
	}
	prime(a,arr);
}
void prime(int a,int arr[]){
	int flag=0;
	
	for(int i=0;i<a;i++){
		int num=arr[i];
         if(num<2)
         continue;
		flag=0;
		for(int j=2;j<num;j++){
		
			if(num%j==0){
				flag=1;
				break;
		}
	}

	
		if(flag==0)
	printf("\n%d ",num);
	}
		
}

	
