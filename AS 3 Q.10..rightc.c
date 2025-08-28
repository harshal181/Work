//10 Find Sum of first and last digit of given number.
//Input: n = 12345
//Output: 6 (1 + 5)

#include<stdio.h>
void main(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	
int a,b;
	while(n>0){
		a=n%10;     //5
		b=n/10000;  //1
		break;
		

	}
	int sum=b+a;
	printf("%d",sum);
		
	}