//8 Check the given number is Strong number or not.
//Input: n = 145
//Output: Strong

#include<stdio.h>
void main(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	
	int temp=n;
	int sum=0;
	while(temp>0){
		int a=temp%10;
		int fact=1;
		while(a>0){
			fact=fact*a;
			a--;
			
		}
		sum=sum+fact;
		temp=temp/10;
	}
	if(n==sum){
		printf("Strong number");
	}
	else{
		printf("not Armstring number");
	}
}