//1. Do all type 3 (with parameter, w/o return type) function programs using pointer.
//palindrome numbers;1.

#include<stdio.h>
void palindrome(int *);

void main(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	palindrome(&n);
}
void palindrome(int *a){
	//int *a=&n;
	
	for(int i=1;i<=*a;i++){
		int rev=0;
		int temp=i;
		if(i>10){
		
		while(temp>0){
			rev=rev*10+(temp%10);
			temp=temp/10;
		}
		}
		if(i==rev)
		printf("%d ",i);
	}
	
}