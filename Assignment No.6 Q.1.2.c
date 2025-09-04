//1. Convert Ass_1 and ASS_2 program into functions with four types of function.

//2. Write a program to check given 3 digit number is pallindrome or not.

#include<stdio.h>
void palindrome1();
int palindrome2();
void palindrome3(int);
int palindrome4(int);

void main(){
	printf("Without parameter & without return type:");
	palindrome1();
	printf("\n without parameter & with return type:");
	int res=palindrome2();
	if(res==1)
	printf("palindrome");
	else
	printf("not palindrome");
	
	printf("\n with parameter & without return type:");
	int n;
	printf("enter the n:");
	scanf("%d",&n);
	palindrome3(n);
	
	printf("\nwith parameter & with return type:");
	int a;
	printf("Enter the a:");
	scanf("%d",&a);
	int check=palindrome4(a);
	if(check==1)
	printf("palindrome");
	else
	printf("not palindrome");
}
void palindrome1(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	
	int a=n%10;
	int b=n/10;
	int c=b%10;
	int d=b/10;
	
	int rev;
	rev=a*100+c*10+d;
	
	if(n==rev)
	printf("palindrome");
	else
	printf("not palindrome");
}
int palindrome2(){
	int n;
	printf("Enter the n:");
	scanf("%d",&n);
	
	int a=n%10;
	int b=n/10;
	int c=b%10;
	int d=b/10;
	
	int rev;
	rev=a*100+c*10+d;
	
	if(n==rev)
	 return 1;
	else
	return 0;
}
void palindrome3(int n){
	
	int a=n%10;
	int b=n/10;
	int c=b%10;
	int d=b/10;
	
	int rev;
	rev=a*100+c*10+d;
	
	if(n==rev)
	printf("palindrome");
	else
	printf("not palindrome");
}
int palindrome4(int n){
	int a=n%10;
	int b=n/10;
	int c=b%10;
	int d=b/10;
	
	int rev;
	rev=a*100+c*10+d;
	
	if(n==rev)
	 return 1;
	else
	 return 0;
}