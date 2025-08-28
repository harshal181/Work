//9 Check the given number is Palindrome number or not.
//Input: n = 121
//Output: Palindrome

#include<stdio.h>
void main(){
	int n;
	printf("Enter the n=");
	scanf("%d",&n);
	int b=n;
	int a;
	int rev=0;
	while(0<n){
		a=n%10;
		rev=rev*10+a;
		n=n/10;
	}
	
	if(b==rev){
		printf("Palindrome");
	}
	else{
		printf("not Palindrome");
	}
	
	
	
	
}