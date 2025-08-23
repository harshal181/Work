//7.Find factorial of given number.
//Input: n = 5
//Output: 120
 
#include<stdio.h>
void main(){
	int n;
	printf("Enter the n=");
	scanf("%d",&n);
	
	int a=1;
	int b=1;
	while(a<=n){
		b=b*a;
		a++;
	}
	printf("%d",b);
}
 
