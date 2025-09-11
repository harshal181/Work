//1. Do all type 3 (with parameter, w/o return type) function programs using pointer.
//check the prime numbers;

#include<stdio.h>
void prime(int*);
void main(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
    prime(&n);
}
	
void prime(int* x){
	//int* x=&n;
	int flag=0;
	int i,j;
	for(i=1;i<=*x;i++){
		flag=0;
		for(j=2;j<i;j++){
			if(i%j==0){
			 flag=1;
				break;
			}
		}
		if(flag==0)
		printf("%d ",i);
		
	}	

}