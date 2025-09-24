//3. Find sum of all numbers.
#include<stdio.h>
int sum(int a,int* brr);
void main(){
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	
	int brr[a];
	printf("Enter the array:");
	for(int i=0;i<a;i++){
		scanf("%d",&brr[i]);
	}
	printf("\nDisplay the array:");
      for(int i=0;i<a;i++){
      	printf("%d ",brr[i]);
	  }
	  
	 int total=sum(a,brr);
	 printf("\nSum= %d",total);
}
int sum(int a,int* brr){
	int sum=0;
	for(int i=0;i<a;i++){
		sum=sum+brr[i];
	}
	return sum;
}