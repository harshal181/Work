//1. Do all type 3 (with parameter, w/o return type) function programs using pointer.
//perfect number;

#include<stdio.h>
void perfect(int *);

void main(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	perfect(&n);
}
void perfect(int *x){
	//int *x=n;
	int i,j;
	int sum;
	for(i=1;i<=*x;i++){
		sum=0;
		for(j=1;j<i;j++){
			if(i%j==0)
				sum=sum+j;
		}
		if(i==sum)
		printf("%d ",i);
	}
}