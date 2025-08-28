//5 Check the given number is Armstrong number or not..
//Input: n = 153
//Output: Armstrong

#include<stdio.h>
void main(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	int temp=n;
	int sum=0;
	while(temp>0){
		int a=temp%10;
		sum=sum+a*a*a;
		temp=temp/10;
		
		
	}
	if(n==sum){
		printf("Armstrong number");
	}
	else{
		printf("not Armstrong number");
	}
}