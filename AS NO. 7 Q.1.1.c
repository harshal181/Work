//1. Do all type 3 (with parameter, w/o return type) function programs using pointer.  
//armstrong numbers;
#include<stdio.h>
void armstrong(int *);

void main(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	armstrong(&n);
}
void armstrong(int *x){
	int i;
	for(i=1;i<=*x;i++){
		int temp=i;
		int count=0;
		int sum=0;
		while(temp>0){
			count++;
			temp=temp/10;
		}
		int stor=i;
		while(stor>0){
		int b=stor%10;
	    int c=1;
		for(int j=1;j<=count;j++){
			c=c*b;	
		}
		sum=sum+c;
		stor=stor/10;
	}
	if(i==sum)
	printf("%d ",i);

}}